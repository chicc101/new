class Movie{
int year;
String title;
String pd;
double score;
void print(){
System.out.println(year + ", "+title+", "+pd+", 5.0/"+score);
}
}
public class MovieTest {
public static void main(String[] args) {
Movie m = new Movie();
m.year = 2012;
m.title = "Total Recall";
m.pd = "p.b";
m.score = 4.5;
m.print();
}
}
