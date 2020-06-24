; constant values
Const KEY_ESCAPE = 1

; graphics variables
Global screenWidth = 800
Global screenHeight = 600
Global screenDepth = 32
Global screenMode = 2
Global frameTimer = CreateTimer(60)

; initialize graphics mode
Graphics screenWidth, screenHeight, screenDepth, screenMode
SetBuffer BackBuffer()

While Not KeyHit(KEY_ESCAPE)
    Cls
    WaitTimer frameTimer

    Flip
Wend
End