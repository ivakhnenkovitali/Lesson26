public class Runner {
    public static void main(String[] args) {
        System.out.println("{pages=89;author=Author5;title=Book5}".matches("\\{((\\w+)=(\\w+);?){3}\\}"));;
    }
}
