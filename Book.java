import java.util.Scanner;

public class Book {

    private String Name = "";
    private String Author = "";
    private String Genre = "";
    private int Year = 0;
    private int Price = 0;
    private Long ISBN = (long) 0;
    private int Number = 0;
    private int lend = 0;

    public static void main(String[] args) {
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        while (!string.contains("Exit")) {
            if (string.contains("Exit")) {
                input.close();
                book.Exit();
            } else {
                if (string.contains("Create")) {
                    book.Create(string.replace("Create ", ""));
                }
                if (string.contains("SetName")) {
                    book.SetName(string.replace("SetName ", ""));
                }
                if (string.contains("GetName")) {
                    book.GetName();
                }
                if (string.contains("SetAuthor")) {
                    book.SetAuthor(string.replace("SetAuthor ", ""));
                }
                if (string.contains("GetAuthor")) {
                    book.GetAuthor();
                }
                if (string.contains("SetGenre")) {
                    book.SetGenre(string.replace("SetGenre ", ""));
                }
                if (string.contains("GetGenre")) {
                    book.GetGenre();
                }
                if (string.contains("SetYear")) {
                    book.SetYear(string.replace("SetYear ", ""));
                }
                if (string.contains("GetYear")) {
                    book.GetYear();
                }
                if (string.contains("SetPrice")) {
                    book.SetPrice(string.replace("SetPrice ", ""));
                }
                if (string.contains("GetPrice")) {
                    book.GetPrice();
                }
                if (string.contains("SetISBN")) {
                    book.SetISBN(string.replace("SetISBN ", ""));
                }
                if (string.contains("GetISBN")) {
                    book.GetISBN();
                }
                if (string.contains("SetNumber")) {
                    book.SetNumber(string.replace("SetNumber ", ""));
                }
                if (string.contains("GetNumber")) {
                    book.GetNumber();
                }
                if (string.contains("Lend")) {
                    book.Lend();
                }
                if (string.contains("GetLend")) {
                    book.GetLend();
                }
                if (string.contains("GiveBack")) {
                    book.GiveBack();
                }
                if (string.contains("Display")) {
                    book.Display();
                }
                string = input.nextLine();
            }
        }
        input.close();
    }

    public void Create(String string) {
        this.Name = string;
        System.out.println("Book Created: " + string);
    }

    public void SetName(String string) {
        this.Name = string;
        System.out.println("Set Name to " + string);
    }

    public String GetName() {
        System.out.println("Get Name is " + Name);
        return Name;
    }

    public void SetAuthor(String string) {
        this.Author = string;
        System.out.println("Set Author of " + this.Name + " to " + string);
    }

    public String GetAuthor() {
        System.out.println("Get Author of " + Name + " is " + Author);
        return Author;
    }

    public void SetGenre(String string) {
        this.Genre = string;
        System.out.println("Set Genre of " + this.Name + " to " + string);
    }

    public String GetGenre() {
        System.out.println("Get Genre of " + Name + " is " + Genre);
        return Genre;
    }

    public void SetYear(String string) {
        this.Year = Integer.parseInt(string);
        System.out.println("Set Year of " + this.Name + " to " + string);
    }

    public String GetYear() {
        System.out.println("Get Year of " + Name + " is " + Year);
        return Integer.toString(Year);
    }

    public void SetPrice(String string) {
        this.Price = Integer.parseInt(string);
        System.out.println("Set Price of " + this.Name + " to " + string);
    }

    public String GetPrice() {
        System.out.println("Get Price of " + Name + " is " + Price);
        return Integer.toString(Price);
    }

    public void SetISBN(String string) {
        this.ISBN = Long.parseLong(string);
        System.out.println("Set ISBN of " + this.Name + " to " + string);
    }

    public String GetISBN() {
        System.out.println("Get ISBN of " + Name + " is " + ISBN);
        return Long.toString(ISBN);
    }

    public void SetNumber(String string) {
        if (Integer.signum(Integer.parseInt(string)) != -1) {
            this.Number = Integer.parseInt(string);
            System.out.println("Set Number of " + this.Name + " to " + string);
        } else {
            System.out.println("Set Number of " + this.Name + " Error");
        }
    }

    public String GetNumber() {
        return Integer.toString(Number);
    }

    public void Display() {
        System.out.println("Book Info");
        System.out.println("> Name: " + Name);
        System.out.println("> Author: " + Author);
        System.out.println("> Genre: " + Genre);
        System.out.println("> Year: " + Year);
        System.out.println("> Price: " + Price);
        System.out.println("> ISBN: " + ISBN);
    }

    public boolean CheckNumber() {
        if (this.Number > 0) {
            return true;
        }
        return false;
    }

    public boolean Lend() {
        if (CheckNumber()) {
            System.out.println("Lent: " + Name + " OK");
            this.lend = this.lend + 1;
            return true;
        }
        System.out.println("Lent: " + Name + " Not Lent");
        return false;
    }

    public String GetLend() {
        return Integer.toString(lend);
    }

    public boolean GiveBack() {
        if (this.lend > 0) {
            System.out.println("Give Back: " + Name + " OK");
            this.lend = this.lend - 1;
            return true;
        }
        System.out.println("Give Back: " + Name + " Not Lent");
        return false;
    }

    public void Exit() {
        System.exit(0);
    }

}
