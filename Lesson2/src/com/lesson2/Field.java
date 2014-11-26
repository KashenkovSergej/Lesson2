package com.lesson2;


public class Field {


    private static final int MAX_FIELD_SIZE = 300;
    private static final int MIN_FILED_SIZE = 0;
    private static final int DEFAULT_FIELD_SIZE = 3;
    private final int fieldSizeX;
    private final int fieldSizeY;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private char[][] items;
    public Field(int sizeX, int sizeY){
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        items = new char[fieldSizeX][fieldSizeY];
        System.out.println("Constructor2");
    }

    public Field(){
       this(DEFAULT_FIELD_SIZE,DEFAULT_FIELD_SIZE);
       System.out.println("Constructor1");

    }


    /*
    public void setFieldSizeX(int newFieldSizeX, int newFieldSizeY){
        if (newFieldSizeX> MIN_FILED_SIZE && newFieldSizeX< MAX_FIELD_SIZE){
            fieldSizeX = newFieldSizeX;
        }
        if (newFieldSizeY> MIN_FILED_SIZE && newFieldSizeY< MAX_FIELD_SIZE){
            fieldSizeY = newFieldSizeY;
        }
    }
*/
    public int getFieldSizeX() {
        return fieldSizeX;
    }
    public int getFieldSizeY() {
        return fieldSizeY;
    }

    public void eraseField(){
        for (int i = 0;i<fieldSizeY; i++) {
            for (int j = 0; j<fieldSizeX; j++) {
                items[i][j] = DEFAULT_CELL_VALUE ;
            }

        }
    }
    public void showField(){
        for (int i=0; i<fieldSizeY; i++) {
            for (int j = 0; j<fieldSizeX; j++) {
                showCell(i,j);
            }
            System.out.println();
        }
        System.out.println();
    }
    private void showCell(int i, int j){
        System.out.print("[" + items[i][j] + "]");
    }
}

// items char [ , , ]
//             0,1,2

/*

    [][][]

 */