package resources;

import libraries.Vector2;

public class RoomInfos
{
	public static final int NB_TILES = 9;
	public static final double TILE_WIDTH = 1.0/ (NB_TILES);
	public static final double TILE_HEIGHT = 1.0/ (NB_TILES);
	public static final Vector2 TILE_SIZE = new Vector2(TILE_WIDTH, TILE_HEIGHT);
	public static final Vector2 HALF_TILE_SIZE = new Vector2(TILE_WIDTH, TILE_HEIGHT).scalarMultiplication(0.5);
	
	public static final Vector2 POSITION_CENTER_OF_ROOM = new Vector2(0.5, 0.5);
	public static final Vector2 POSITION_LEFT_OF_ROOM=new Vector2(0.15,0.5);
	public static final Vector2 POSITION_RIGHT_OF_ROOM=new Vector2(0.85,0.5);
	public static final Vector2 POSITION_TOP_OF_ROOM=new Vector2(0.5,0.85);
	public static final Vector2 POSITION_BOTTOM_OF_ROOM=new Vector2(0.5,0.15);
}
