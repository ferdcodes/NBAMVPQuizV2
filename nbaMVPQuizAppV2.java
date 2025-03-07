/*
 * NBAQuizAppV2
 * An improved version of the original NBAQuizApp
 * Changes: -array that stored names of all guesses
 * +loops that make user guess until correct, + a counter that counts how many times you've guessed
 * +shows the percentage of guesses right.
 */

//next version: hints, displays correct answers, display % of answers right
import java.util.Scanner;

public class nbaMVPQuizAppV2
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    int counter = 0, cont = 0;
    String userstr = "";
    
    System.out.println("Welcome to the NBA MVP Quiz V2!");
    System.out.println("All answers must be in full first and last name (at the time they won MVP) AND be properly capitialized");
    
    do
    {
     System.out.println("Who was the 2023-2024 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 2022-2023 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Joel Embiid"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 2021-2022 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2020-2021 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2019-2020 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Giannis Antetokounmpo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2018-2019 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Giannis Antetokounmpo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2017-2018 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("James Harden"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2016-2017 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Russell Westbrook"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2015-2016 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Stephen Curry"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2014-2015 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Stephen Curry"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2013-2014 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kevin Durant"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2012-2013 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2011-2012 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2010-2011 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Derrick Rose"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2009-2010 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2008-2009 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2007-2008 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kobe Bryant"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2006-2007 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Dirk Nowitzki"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2005-2006 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Steve Nash"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2004-2005 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Steve Nash"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2003-2004 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kevin Garnett"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2002-2003 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Tim Duncan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2001-2002 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Tim Duncan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2000-2001 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Allen Iverson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1999-2000 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Shaquille O'Neal"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1998-1999 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Karl Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1997-1998 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1996-1997 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Karl Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1995-1996 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1994-1995 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("David Robinson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1993-1994 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Hakeem Olajuwon"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1992-1993 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Charles Barkley"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1991-1992 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1990-1991 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1989-1990 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1988-1989 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1987-1988 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1986-1987 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1985-1986 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1984-1985 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1983-1984 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1982-1983 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1981-1982 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1980-1981 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Julius Erving"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1979-1980 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1978-1979 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1977-1978 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Walton"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1976-1977 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1975-1976 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1974-1975 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bob McAdoo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1973-1974 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1972-1973 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Dave Cowens"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1971-1972 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1970-1971 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Lew Alcindor"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1969-1970 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Willis Reed"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1968-1969 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Wes Unseld"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1967-1968 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1966-1967 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1965-1966 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1964-1965 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1963-1964 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Oscar Robertson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1962-1963 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1961-1962 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1960-1961 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1959-1960 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1958-1959 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bob Pettit"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1957-1958 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1956-1957 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bob Cousy"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1955-1956 NBA MVP?");
     userstr = input.nextLine();
     if(userstr.equals("Bob Pettit"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    System.out.println("You took " + counter + " tries to guess all NBA MVPS!");

  }
}