package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {

    private ArrayList<Double> historyList;

    public ContainerHistory() {
        historyList = new ArrayList<Double>();
    }

    public void add(double situation) {
        historyList.add(situation);
    }

    public void reset() {
        historyList.clear();
    }

    public double maxValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Collections.sort(historyList, Collections.reverseOrder());
            return historyList.get(0);
        }
    }

    public double minValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Collections.sort(historyList);
            return historyList.get(0);
        }
    }

    public double average() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Double sum = 0.0;
            for(Double d : historyList) {
                sum += d;
            }
            return sum / historyList.size();
        }
    }

    /*

    // this is not correct LOL

    public double greatestFluctuation() {
        if(historyList.isEmpty() || historyList.size() == 1) {
            return 0.0;
        }
        else {
            // Compare min and max values. absolute value is the num farthest from 0
            if(Math.abs(this.maxValue()) > Math.abs(this.minValue())) {
                return Math.abs(this.maxValue());
            }
            else {
                return Math.abs(this.minValue());
            }
        }
    }
    */

    public double greatestFluctuation() {
        if(historyList.isEmpty() || historyList.size() == 1) {
            return 0.0;
        }
        else {
            Double num = 0.0;
            for(int i = 0; i < historyList.size() - 1; i++) {
                Double num2 = Math.abs(historyList.get(i) - historyList.get(i + 1));
                if(num2 > num) {
                    num = num2;
                }
            }
            return num;
        }
    }

    public double variance() {
        if(historyList.isEmpty() || historyList.size() == 1) {
            return 0.0;
        }
        else {
            Double sum = 0.0;
            for(Double d : historyList) {
                sum += Math.pow(d - this.average(), 2);
            }
            return sum / (historyList.size() - 1);
        }
    }

    @Override
    public String toString() {
        return historyList.toString();
    }
}
