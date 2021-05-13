import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoBang {
    private static int BOARD_SIZE = 15;
    // 定义一个二位数组来保存键盘
    private String[][] board;

    // 初始化棋盘数组
    private void initBoard() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "+";
            }
        }
    }

    // 输入键盘
    private void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        GoBang bang = new GoBang();
        bang.initBoard();
        bang.printBoard();

        // 用于读取键盘输入
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //
        String inputStr = null;
        // reader.readLine(): 用户读取用户键盘输入一行的内容，刚输入的内容会被br读取到
        while ((inputStr = reader.readLine()) != null) {
            // 获取用户输入的字符串
            String[] posStrArr = inputStr.split(",");
            // 将用户输入的转成棋子的坐标
            int posX = Integer.parseInt(posStrArr[0]);
            int posY = Integer.parseInt(posStrArr[1]);
            // 修改棋盘数组对应的图片
            bang.board[posX][posY] = "⚫";
            // 重写绘制棋盘
            bang.printBoard();
            System.out.println("请输入您下棋的X,Y的位置(以英文逗号分割)：");
        }
    }
}
