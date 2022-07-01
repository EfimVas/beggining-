
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Напишите имя пользователя: ");
       String admin = scan.nextLine();
       System.out.print("Пароль: ");
       String pass = scan.nextLine();
        if (admin.equals("vas") && pass.equals("vas")) {
            System.out.print("Доступ разрешен");
            } else {
                System.out.print("Доступ запрещен, введите заново: ");
                String pass2 = scan.nextLine();
            };
                if (pass2.equals("vas")){ //надо подумать тут
                    System.out.print("Код верный, добро пожаловать");
                } else {
                    System.out.print("Код неверный, начат отсчет самоуничтожения");   
                    System.out.println("3");
                    System.out.println("2");
                    System.out.println("1");
                    System.out.println("Все данные уничтожены");
                }
        }
}


