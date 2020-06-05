package sum;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers;

    public Numbers() {
        this.numbers = new ArrayList<>();
    }

    public void add(Integer num) {
        this.numbers.add(num);
    }
    public boolean isEmpty(Numbers numbers){
        return this.numbers.isEmpty();
    }

    public int sum(Numbers numbers) {
        int sum = 0;
        for (int i = 0; i < this.numbers.size(); i++) {
            sum += this.numbers.get(i);
        }
        return sum;
    }

}
