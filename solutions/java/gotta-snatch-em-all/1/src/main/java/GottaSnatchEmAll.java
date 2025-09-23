import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
        }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
        }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty())
            return false;
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
            
        }

    static Set<String> commonCards(List<Set<String>> collections) {
        return collections.stream().reduce(new HashSet<String>(collections.getFirst()), 
            (a,b) -> {
                a.retainAll(b);
                return a;});
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections
            .stream()
            .flatMap(Set :: stream)
            .collect(Collectors.toSet());
    }
}
