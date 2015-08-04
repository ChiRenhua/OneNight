package com.example.onenight;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class GameDatabase extends SQLiteOpenHelper {
	private final static String DATABASE_NAME = "Gamedatabase.db";
	private final static int DATABASE_VERSION = 1;
	public final static String TABLE_CNAME = "Characters_table";
	public final static String CHARACTER_NAME = "Character_name";
	public final static String TABLE_PNAME = "Player_table";
	public final static String PLAYER_NAME = "Player_name";
	public final static String PLAYER_SEAT_NUMBER = "Player_Seat_Number";
	public final static String PICTURE_NAME = "Picture_Name";

	public GameDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String csql = "CREATE TABLE " + TABLE_CNAME + " (" + CHARACTER_NAME
				+ " text);";
		String psql = "CREATE TABLE " + TABLE_PNAME + " (" + PLAYER_NAME
				+ " text, " + PLAYER_SEAT_NUMBER + " text, " + PICTURE_NAME
				+ " text  );";
		db.execSQL(csql);
		db.execSQL(psql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		String csql = "DROP TABLE IF EXISTS " + TABLE_CNAME;
		String psql = "DROP TABLE IF EXISTS " + TABLE_PNAME;
		db.execSQL(csql);
		db.execSQL(psql);
		onCreate(db);
	}

	public Cursor select(String TABLE_NAME) {
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db
				.query(TABLE_NAME, null, null, null, null, null, null);
		return cursor;
	}

	// Ôö¼Ó²Ù×÷
	public long insert(String TABLE_NAME, String name, String seatNumber,
			String pictureName) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues cv = new ContentValues();
		long row = -1;
		if (TABLE_NAME.equals(TABLE_CNAME)) {
			cv.put(CHARACTER_NAME, name);
			row = db.insert(TABLE_NAME, null, cv);
		} else if (TABLE_NAME.equals(TABLE_PNAME)) {
			cv.put(PLAYER_NAME, name);
			cv.put(PLAYER_SEAT_NUMBER, seatNumber);
			cv.put(PICTURE_NAME, pictureName);
			row = db.insert(TABLE_NAME, null, cv);
		}
		return row;
	}

	// É¾³ý²Ù×÷
	public void delete(String TABLE_NAME, String name, String seatNumber,
			String pictureName) {
		SQLiteDatabase db = this.getWritableDatabase();
		if (TABLE_NAME.equals(TABLE_CNAME)) {
			String sql = "delete from TABLE_CNAME where CHARACTER_NAME='"
					+ name + "'";// É¾³ý²Ù×÷µÄSQLÓï¾ä
			db.execSQL(sql);
		} else if (TABLE_NAME.equals(TABLE_PNAME)) {
			String sql = "delete from TABLE_PNAME where PLAYER_NAME='" + name
					+ "' and PLAYER_SEAT_NUMBER='" + seatNumber
					+ "' and PICTURE_NAME='" + pictureName + "'";// É¾³ý²Ù×÷µÄSQLÓï¾ä
			db.execSQL(sql);
		}

	}

	// ÐÞ¸Ä²Ù×÷
	public void update(String TABLE_NAME, String name, String seatNumber,
			String pictureName) {
		SQLiteDatabase db = this.getWritableDatabase();
		if (TABLE_NAME.equals(TABLE_CNAME)) {
			String where = CHARACTER_NAME + " = ?";
			String[] whereValue = { name };
			ContentValues cv = new ContentValues();
			cv.put(CHARACTER_NAME, name);
			db.update(TABLE_NAME, cv, where, whereValue);
		} else if (TABLE_NAME.equals(TABLE_PNAME)) {
			String where = PLAYER_NAME + " = ?";
			String[] whereValue = { name };
			ContentValues cv = new ContentValues();
			cv.put(PLAYER_NAME, name);
			cv.put(PLAYER_SEAT_NUMBER, seatNumber);
			cv.put(PICTURE_NAME, pictureName);
			db.update(TABLE_NAME, cv, where, whereValue);
		}

	}

}
