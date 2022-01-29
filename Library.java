import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String LibraryName = "";
    private List<Book> books = new ArrayList<Book>();
    private Book selected = null;

    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        while (!string.contains("Exit")) {
            if (string.contains("Exit")) {
                input.close();
                library.Exit();
            } else {
                if (string.contains("Create")) {
                    library.Create(string.replace("Create ", ""));
                }
                if (string.contains("SetName")) {
                    library.SetName(string.replace("SetName ", ""));
                }
                if (string.contains("GetName")) {
                    library.GetName();
                }
                if (string.contains("AddBook")) {
                    library.AddBook(string.replace("AddBook ", ""));
                }
                if (string.contains("Report")) {
                    library.Report();
                }
                if (string.contains("Select")) {
                    library.Select(string.replace("Select ", ""));
                }
                if (string.contains("SetAuthor")) {
                    library.SetAuthor(string.replace("SetAuthor ", ""));
                }
                if (string.contains("GetAuthor")) {
                    library.GetAuthor();
                }
                if (string.contains("SetGenre")) {
                    library.SetGenre(string.replace("SetGenre ", ""));
                }
                if (string.contains("GetGenre")) {
                    library.GetGenre();
                }
                if (string.contains("SetYear")) {
                    library.SetYear(string.replace("SetYear ", ""));
                }
                if (string.contains("GetYear")) {
                    library.GetYear();
                }
                if (string.contains("SetPrice")) {
                    library.SetPrice(string.replace("SetPrice ", ""));
                }
                if (string.contains("GetPrice")) {
                    library.GetPrice();
                }
                if (string.contains("SetISBN")) {
                    library.SetISBN(string.replace("SetISBN ", ""));
                }
                if (string.contains("GetISBN")) {
                    library.GetISBN();
                }
                if (string.contains("SetNumber")) {
                    library.SetNumber(string.replace("SetNumber ", ""));
                }
                if (string.contains("Lend")) {
                    library.Lend();
                }
                if (string.contains("GiveBack")) {
                    library.GiveBack();
                }
                if (string.contains("Display")) {
                    library.Display();
                }
                string = input.nextLine();
            }
        }
        input.close();
    }

    public void Create(String string) {
        this.LibraryName = string;
        System.out.println("Library Created: " + string);
    }

    public void SetName(String string) {
        this.LibraryName = string;
        System.out.println("Set Name to " + string);
    }

    public String GetName() {
        System.out.println("Get Name is " + LibraryName);
        return LibraryName;
    }

    public void AddBook(String string) {
        Book book = new Book();
        book.Create(string);
        this.books.add(book);
    }

    public void Report() {
        System.out.println("List Of Books:");
        for (Book book : books) {
            System.out.println("> " + book.Name + " " + book.Number + " " + book.lend);
        }
    }

    public void Select(String string) {
        boolean f = false;
        for (Book book : books) {
            if (book.Name.equals(string)) {
                selected = book;
                f = true;
                System.out.println("Book " + book.Name + " Select");
            }
        }
        if (!f) {
            System.out.println("Book " + string + " Not Found");
        }
    }

    public void SetAuthor(String string) {
        if (selected != null) {
            selected.SetAuthor(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public String GetAuthor() {
        if (selected != null) {
            return selected.GetAuthor();
        } else {
            System.out.println("Please Select a Book First");
        }
        return null;
    }

    public void SetGenre(String string) {
        if (selected != null) {
            selected.SetGenre(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public String GetGenre() {
        if (selected != null) {
            return selected.GetGenre();
        } else {
            System.out.println("Please Select a Book First");
        }
        return null;
    }

    public void SetYear(String string) {
        if (selected != null) {
            selected.SetYear(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public String GetYear() {
        if (selected != null) {
            return selected.GetYear();
        } else {
            System.out.println("Please Select a Book First");
        }
        return null;
    }

    public void SetPrice(String string) {
        if (selected != null) {
            selected.SetPrice(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public String GetPrice() {
        if (selected != null) {
            return selected.GetPrice();
        } else {
            System.out.println("Please Select a Book First");
        }
        return null;
    }

    public void SetISBN(String string) {
        if (selected != null) {
            selected.SetISBN(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public String GetISBN() {
        if (selected != null) {
            return selected.GetISBN();
        } else {
            System.out.println("Please Select a Book First");
        }
        return null;
    }

    public void SetNumber(String string) {
        if (selected != null) {
            selected.SetNumber(string);
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public void Lend() {
        if (selected != null) {
            selected.Lend();
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public void GiveBack() {
        if (selected != null) {
            selected.GiveBack();
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public void Display() {
        if (selected != null) {
            selected.Display();
        } else {
            System.out.println("Please Select a Book First");
        }
    }

    public void Exit() {
        System.exit(0);
    }

    public class Book {
        String Name = "";
        String Author = "";
        String Genre = "";
        int Year = 0;
        int Price = 0;
        Long ISBN = (long) 0;
        int Number = 0;
        int lend = 0;

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

}
