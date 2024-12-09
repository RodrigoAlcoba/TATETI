import java.util.List;
import java.util.Scanner;

public class TaTeTi {

    private char[][] tablero = new char[3][3];
    private boolean ganador;

    public TaTeTi() {
    }

    public void jugar(){
        System.out.println("Indique el nombre del primer jugador");
        Scanner sc = new Scanner(System.in);
        Jugador jugador1 = new Jugador(sc.nextLine());
        System.out.println("Indique el nombre del segundo jugador");
        Jugador jugador2 = new Jugador(sc.nextLine());

        mostrarTablero();
        System.out.println("turno del jugador " + jugador1.getNombre());
        marcarX();

        mostrarTablero();
        System.out.println("turno del jugador " + jugador2.getNombre());
        marcarO();


        mostrarTablero();
        System.out.println("turno del jugador " + jugador1.getNombre());
        marcarX();

        mostrarTablero();
        System.out.println("turno del jugador " + jugador2.getNombre());
        marcarO();

        mostrarTablero();
        System.out.println("turno del jugador " + jugador1.getNombre());
        marcarX();
        ganador = hayGanador();
        if (ganador){
            System.out.println("el jugador "+ jugador1.getNombre() +" gano");
            return;
        }

        mostrarTablero();
        System.out.println("turno del jugador " + jugador2.getNombre());
        marcarO();
        ganador = hayGanador();
        if (ganador){
            System.out.println("el jugador "+ jugador2.getNombre() +" gano");
            return;
        }

        mostrarTablero();
        System.out.println("turno del jugador " + jugador1.getNombre());
        marcarX();
        ganador = hayGanador();
        if (ganador){
            System.out.println("el jugador "+ jugador1.getNombre() +" gano");
            return;
        }

        mostrarTablero();
        System.out.println("turno del jugador " + jugador2.getNombre());
        marcarO();
        ganador = hayGanador();
        if (ganador){
            System.out.println("el jugador "+ jugador2.getNombre() +" gano");
            return;
        }

        mostrarTablero();
        System.out.println("turno del jugador " + jugador1.getNombre());
        marcarX();
        ganador = hayGanador();
        if (ganador){
            System.out.println("el jugador "+ jugador1.getNombre() +" gano");
            return;
        }
        System.out.println("Hay empate");
    }

    public void marcarX(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique en que fila desea marcar");
        int fila = scanner.nextInt();
        System.out.println("Indique en que columna desea marcar");
        int columna = scanner.nextInt();
        if (tablero[fila][columna] != 'X' && tablero[fila][columna] != 'O'){
            tablero[fila][columna] = 'X';
        }else {
            System.out.println("Casilla ocupada, intentemos nuevamente");
            mostrarTablero();
            marcarX();
        }
    }

    public void marcarO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique en que fila desea marcar");
        int fila = scanner.nextInt();
        System.out.println("Indique en que columna desea marcar");
        int columna = scanner.nextInt();
        if (tablero[fila][columna] != 'X' && tablero[fila][columna] != 'O'){
            tablero[fila][columna] = 'O';
        }else {
            System.out.println("Casilla ocupada, intentemos nuevamente");
            mostrarTablero();
            marcarO();
        }
    }





    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean hayGanador(){
        for(int i = 0; i < 3; i++){
            if (tablero[0][i] == 'X' && tablero[1][i] == 'X' && tablero[2][i] == 'X' || tablero[0][i] == 'O' && tablero[1][i] == 'O' && tablero[2][i] == 'O'){
                return true;
            }

            if (tablero[i][0] == 'X' && tablero[i][1] == 'X' && tablero[i][2] == 'X' || tablero[i][0] == 'O' && tablero[i][1] == 'O' && tablero[i][2] == 'O'){
                return true;
            }

            if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X' || tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O'){
                return true;
            }
            if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X' || tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O'){
                return true;
            }
        }
        return false;
    }

    public boolean hayEmpate(){
            for(int i = 0; i < 3; i++){
                if (tablero[0][i] == 'X' && tablero[1][i] == 'X' && tablero[2][i] == 'X' || tablero[0][i] == 'O' && tablero[1][i] == 'O' && tablero[2][i] == 'O'){
                    return false;
                }

                if (tablero[i][0] == 'X' && tablero[i][1] == 'X' && tablero[i][2] == 'X' || tablero[i][0] == 'O' && tablero[i][1] == 'O' && tablero[i][2] == 'O'){
                    return false;
                }

                if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X' || tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O'){
                    return false;
                }
                if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X' || tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O'){
                    return false;
                }
            }
            return true;
    }






}
