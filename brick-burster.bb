; constant values
Const KEY_ESCAPE = 1
Const KEY_LEFT = 203
Const KEY_RIGHT = 205
Const KEY_UP = 200
Const KEY_DOWN = 208

Const WOOD_SPEED = 5

; graphics variables
Global screenWidth = 720
Global screenHeight = 500
Global screenDepth = 32
Global screenMode = 2
Global frameTimer = CreateTimer(60)

; initialize graphics mode
Graphics screenWidth, screenHeight, screenDepth, screenMode
SetBuffer BackBuffer()

; clear screen color
ClsColor 31, 45, 59

; wood
Global wood# = LoadImage("gfx/wood.png")
Global woodX = screenWidth / 2 - ImageWidth(wood) / 2
Global woodY = screenHeight - 50

; bricks
Global bricks = LoadAnimImage("gfx/bricks.png", 48, 16, 0, 10)

While Not KeyHit(KEY_ESCAPE)
    Cls
    WaitTimer frameTimer

    DrawImage wood, woodX, woodY
    DrawImage bricks, 0, 0, 5
    MoveWood()

    Flip 0
Wend
End

Function MoveWood()
    If KeyDown(KEY_LEFT) And woodX > WOOD_SPEED Then woodX = woodX - WOOD_SPEED
    If KeyDown(KEY_RIGHT) AND woodX < screenWidth - ImageWidth(wood) - WOOD_SPEED Then woodX = woodX + WOOD_SPEED
End Function


Function LoadLevel(level)

End Function

; data fields for brick levels
.level1
Data 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
Data 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
Data 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
Data 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
Data 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0