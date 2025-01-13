public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
     public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    public double[] getWages() {
        return wages;
    }    

    /*  Returns the bonus threshold as described in part (a).
     */
    
     public double computeBonusThreshold() {
        int max = itemsSold[0];
        int min = itemsSold[0];
        int all = 0;
        int length = itemsSold.length - 2;
        
        for (int num : itemsSold) {
            all += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        all -= max;
        all -= min;
    
        double avg = (double) all/length;
        return avg;
    
    }

    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        int index = 0;
        for (int num : itemsSold) {
            if (num <= computeBonusThreshold()) {
                wages[index] = fixedWage + (perItemWage * num);
            }
            else {
                wages[index] = (fixedWage + (perItemWage * num)) * 1.1;
            }
            index++;
        }
    }
    
  }
  
  
  