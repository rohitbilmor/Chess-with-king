# Chess-with-king
In this version of chess, only two kings pieces are placed on the chessboard. Initially, the coordinates of the first king piece are generated (X1,Y1), it is placed on the chessboard at the generated position. Now, the coordinates of the second king piece are generated (X2,Y2), it is placed on the chessboard at the generated position.

These pieces can be moved in a sequential manner, that is, one by one, starting from the first piece. Both the kings want to win if they can not, at least draw.

Rules:
The chessboard is a standard  board.
The kings can move from one cell to another if they have an edge or corner in common.
If the generated coordinates of the second king are exactly equal to the first, then the second king wins.
Both players play optimally.
The game is considered to be won by the first king piece if after it moves, then it can have the same coordinates as the second. The second king piece becomes the winner if after this piece is moved, then both kings have the same coordinates. The game is drawn if there is no possible ways for anyone to win if both the pieces are played optimally.
