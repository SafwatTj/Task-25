import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("jack", "johnson", "jacj@mail.com", List.of(
                        new BankAccount("DE001", 10.10),
                        new BankAccount("DE002", 12.10),
                        new BankAccount("DE003", 13.10)
                )),
                new Person("ann", "johnson", "ann@mail.com", List.of(
                        new BankAccount("DE004", 101.10),
                        new BankAccount("DE005", 121.10)
                )),
                new Person("nick", "nickson", "jacj@mail.com", List.of(
                        new BankAccount("DE006", 210.10),
                        new BankAccount("DE007", 212.10),
                        new BankAccount("DE008", 213.10)
                ))
        );


        double sum = list.stream()
                .flatMap(p -> p.getAccounts().stream())
                .mapToDouble(a -> a.getBalance())
                .sum();


        System.out.println(sum);

        List<Person2> persons2 = List.of(
                new Person2("jack", new BankAccount("DE0001", 10)),
                new Person2("ann", new BankAccount("DE0002", 20)),
                new Person2("lena", new BankAccount("DE0003", 30)),
                new Person2("john", new BankAccount("DE0004", 40)),
                new Person2("lena", new BankAccount("DE0005", 50)),
                new Person2("jack", new BankAccount("DE0006", 60)),
                new Person2("jack", new BankAccount("DE0007", 20))
        );

        Map<String, List<Person2>> collect = persons2.stream().collect(Collectors.groupingBy(p -> p.getName()));
        System.out.println(collect);

        Map<String, List<Person2>> collect2 = persons2.stream().collect(Collectors.groupingBy(p -> p.getName()));

        Map<Boolean, List<Person2>> j = persons2.stream().collect(Collectors.partitioningBy(p -> p.getName().startsWith("j")));
        System.out.println(j);
    }





}