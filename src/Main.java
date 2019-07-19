public class Main {
    public static void main(String[] args) {
        orderedRepository();
        sortedRepository();
    }

    private static void orderedRepository() {
        OrderedRepository<Integer> orderedRepository = new OrderedRepository<Integer>();
        orderedRepository.save(21);
        orderedRepository.save(12);
        orderedRepository.save(6);
        orderedRepository.save(8);

        orderedRepository.remove(21);

        System.out.println("Ordered Repository");
        System.out.println("number of elements:" + orderedRepository.count());
        System.out.println("list before conversion of list to set: " + orderedRepository.listList());
        System.out.println("list after conversion of list to set: " + orderedRepository.listAll());
    }

    private static void sortedRepository() {
        SortedRepository<Integer> sortedRepository = new SortedRepository<Integer>();
        sortedRepository.save(34);
        sortedRepository.save(23);
        sortedRepository.save(2);

        sortedRepository.remove(23);

        System.out.println();
        System.out.println("Sorted Repository");
        System.out.println("number of elements: " + sortedRepository.count());
        System.out.println(sortedRepository.listAll());

    }
}
