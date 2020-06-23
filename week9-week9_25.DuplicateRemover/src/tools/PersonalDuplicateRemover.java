package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings = new HashSet<String>();
    private int numberOfDetectedDuplicates;

    public PersonalDuplicateRemover() {
        numberOfDetectedDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        // stores a characterString if it's not a duplicate
        if(!strings.contains(characterString)) {
            strings.add(characterString);
        }
        else if(strings.contains(characterString)) {
            numberOfDetectedDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        // returns the number of detected duplicates.
        return numberOfDetectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        // returns an object which implements the interface Set<String>.
        // Object should have all unique characterStrings (no duplicates!).
        // If there are no unique characterStrings, method returns an empty set.
        Set<String> uniqueStrings = new HashSet<String>();

        for(String s : strings) {
            uniqueStrings.add(s);
        }
        return uniqueStrings;
    }

    @Override
    public void empty() {
        // removes stored characterStrings and
        // resets the amount of detected duplicates.
        strings.clear();
        numberOfDetectedDuplicates = 0;
    }
}
