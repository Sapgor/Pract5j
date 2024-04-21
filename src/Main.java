//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

// определение количества стен в замке
        static int Walls(int tower)
        {
            return tower * 4;
        }

// расчет площади двора замка
        static double CastlebackyardArea(double side_length)
        {
            return side_length * side_length;
        }

// проверка количества охранников на каждый вход
        static boolean Guards_quantity(int Doors, int Guards)
        {
            return Doors >= 2 && Guards > 10;
        }


// расчет числа бойцов, знающих про тайный ход в замке
        int Guards_knowhide(int corridor_width, int Guard)
        {
            return Guard / corridor_width;
        }

//  общая площадь помещений в замке
        double ploshad_pomesheniy(double ploshad1, double ploshad2, double ploshad3)
        {
            return ploshad1 + ploshad2 + ploshad3;
        }

// определение времени, которое займет осада замка
        int Siege_time( int Guardians_quantity, int enemies_quantity)
        {
            return Guardians_quantity > enemies_quantity ? 0 : (enemies_quantity -Guardians_quantity) * 2;
        }


// проверка, есть ли секретный проход в замке
        boolean SecretPass(boolean HiddenDoor, boolean Torch_lit)
        {
            return HiddenDoor && Torch_lit;
        }

// оценка общего числа противников вне замка
        int TotalEnemies(int enemies_north, int enemies_south, int enemies_west, int enemies_east)
        {
            return enemies_north + enemies_south + enemies_west + enemies_east;
        }
    }
}