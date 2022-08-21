import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Sudoku_solver {

    protected JPanel sudokuBoard;

    public JPanel getBoard(){
        this.buildSudokuField();
        this.sudokuBoard.setBackground( Color.PINK);
        return this.sudokuBoard;
    }


    public boolean isValid(int[][] field) {
        if (field.length != 9) {
            return false;
        }
        for (int[] y : field) {
            if (y.length != 9) {
                return false;
            }
            for (int x : y) {
                if (x < 0 || x > 9) {
                    return false;
                }
            }
        }
        return true;
    }

    public void buildSudokuField() {

        int[][] data = this.generateFieldValues();

        if(!isValid(data)){
            throw new RuntimeException("Provided data was not correct!");
        }

        GridLayout sudoku_grid = new GridLayout(3,3, 5,5);
        JPanel sudoku_field = new JPanel();

        sudoku_field.setLayout(sudoku_grid);

        // Kvadratki
        for(int y = 0; y < 9; y++){
            GridLayout grid = new GridLayout(3,3);
            JPanel kvadratek = new JPanel();
            int row = 0;
            int column = 0;

            kvadratek.setLayout(grid);
            // Polja v posamicen kvadratku
            for(int x = 0; x < 9; x++){
                kvadratek.add(new JTextField(
                        data[y][x] == 0 ? "" : Integer.toString(data[y][x])
                ));
            }
            sudoku_field.add(kvadratek);

        }

        this.sudokuBoard = sudoku_field;

    }
    public boolean isFound(int[] field, int value) {
        for (int x = 0; x < 9; x++) {
            if (field[x] == value) {
                return true;
            }
        }
        return false;
    }

    public int[][] generateFieldValues() {
        int[][] field = new int[9][9];
        Random ran = new Random();

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                int nv = ran.nextInt(9 - 1);
                if(this.isFound(field[x], nv)){
                    while(this.isFound(field[x], nv)){
                        nv = ran.nextInt(9 - 1);
                        if(!this.isFound(field[x], nv)){
                            break;
                        }
                    }
                }
                field[y][x] = nv;
            }
        }
        return field;
    }
}


