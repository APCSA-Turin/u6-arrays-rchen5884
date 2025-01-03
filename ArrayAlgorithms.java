public class ArrayAlgorithms {

    private ArrayAlgorithms() {

    }

  /** Returns the average of all values in numList as a double.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static double average(int[] numList) {
    int sum = 0;
    for (int i = 0; i < numList.length;i++) {
        sum += numList[i];
    }
    return (double) sum/numList.length;

  }

   /** Returns the value in numList that represents the minimum
   * value in numList.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static int minimum(int[] numList) {
    int min = numList[0];
    for (int i = 0; i < numList.length; i++) {
        if (min > numList[i]) {
            min = numList[i];
        }
    }
    return min;
  }

 /** Returns the number of Strings in strList that contain the target.
   *
   *  PRECONDITION: strList.length > 0
   */
  public static int howManyContain(String[] strList, String target) {
    int times = 0;
    for (int i = 0; i < strList.length; i++) {
        if (strList[i].indexOf(target) != -1) {
            times++;
        }
    }
    return times;
  }

    /** Returns an array containing all characters in myStr, in order.
   *
   *  PRECONDITION: myStr.length() > 0
   */
  public static String[] stringToArray(String myStr) {
    String[] strArray = new String[myStr.length()]; 

    for (int i = 0; i < myStr.length(); i++) {
      strArray[i] = Character.toString(myStr.charAt(i));
    }

    return strArray;
}

public static void reversePrint(String[] strArr) {
  for (int i = strArr.length - 1; i >= 0; i--) {
    String currentStr = strArr[i];
    for (int j = currentStr.length() - 1; j>= 0;j--) {
      System.out.println(currentStr.substring(j, j+1));
    }
    System.out.println();
  }
}

public static int[] combine(int[] arr1, int[] arr2) {
  int[] combinedArray = new int[arr1.length + arr2.length];
  for (int i = 0; i < arr1.length; i++) {
      combinedArray[i] = arr1[i];
  }
  for (int i = 0; i < arr2.length; i++) {
      combinedArray[i + arr1.length] = arr2[i];
  }
  return combinedArray;
  }

   /** Changes the first and last element of nums to be num
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: nums.length > 0
   */
  public static void bookEnd(int[] nums, int num) {
    int length = nums.length;
    nums[0] = num;
    nums[length - 1] = num;
}

  /** Multiplies each number in numList by multiplier.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void multiplyBy(int[] numList, int multiplier) {
    for (int i = 0; i < numList.length; i++) {
      numList[i] = numList[i] * multiplier;
    }
  }

   /** Returns an array of ints where each element is the product
   *  of the corresponding element in numList and multiplier.
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
    int[] numListCopy = new int[numList.length];
    for (int i = 0; i < numList.length; i++) {
      numListCopy[i] = numList[i] * multiplier;
    }
    return numListCopy;
  }

   /** Adds a "!" to the end of each String in wordList.  However, if a
   *  a string already ends in an exclamation point, do NOT add another.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: wordList.length > 0
   */
  public static void addExclamation(String[] wordList) {
    for (int i = 0; i < wordList.length; i++) {
      String word = wordList[i];
      String lastChar = word.substring(word.length() - 1);
      if (!lastChar.equals("!")) {
        wordList[i] = wordList[i] + "!";
      }
    }
  }

  /** Returns an array of booleans where each element reflects whether
   *  the corresponding element in tempList is at or below the freezing
   *  temperature of 32 (true) or not (false).
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: tempList.length > 0
   */
  public static boolean[] isFreezing(int[] tempList) {
    boolean[] freezing = new boolean[tempList.length];
    for (int i = 0; i < freezing.length; i++) {
      if (tempList[i] <= 32) {
        freezing[i] = true;
      }
      else {
        freezing[i] = false;
      }
    }
    return freezing;
  }

 // Shift all elements left by one index
 public static void shiftLeft(int[] numList) {
  int first = numList[0]; // Store the first element
  for (int i = 0; i < numList.length - 1; i++) {
      numList[i] = numList[i + 1];
  }
  numList[numList.length - 1] = first; // Wrap the first element to the end
}

// Shift all elements right by one index
public static void shiftRight(int[] numList) {
  int last = numList[numList.length - 1]; // Store the last element
  for (int i = numList.length - 1; i > 0; i--) {
      numList[i] = numList[i - 1];
  }
  numList[0] = last; // Wrap the last element to the front
}

// Reverse elements using Strategy 1 (copy)
public static void reverse(int[] numList) {
  int[] copy = new int[numList.length];
  for (int i = 0; i < numList.length; i++) {
      copy[i] = numList[i];
  }
  for (int i = 0; i < numList.length; i++) {
      numList[i] = copy[numList.length - 1 - i];
  }
}

// Reverse elements using Strategy 2 (in place)
public static void reverseInPlace(int[] numList) {
  for (int i = 0; i < numList.length / 2; i++) {
      int temp = numList[i];
      numList[i] = numList[numList.length - 1 - i];
      numList[numList.length - 1 - i] = temp;
  }
}

  public static String longestString(String[] stringList) {
    String longStr = "";
    for (String str : stringList) {
      if (str.length() >= longStr.length()) {
        longStr = str;
      }
    }
    return longStr;
  }

  public static boolean containsPositive(int[] numList) {
    for (int num : numList) {
      if (num > 0) {
        return true;
      }
    }
    return false;
  }

  public static String[] makeLowercase(String[] wordList) {
    String[] lowStrings = new String[wordList.length];

    for (int i = 0; i < wordList.length; i++) {
        lowStrings[i] = wordList[i].toLowerCase();
    }
    return lowStrings;
  }

  public static int endsInExclamations(String[] stringList) {
  int count = 0;
    for (String str : stringList) {
        if (str.indexOf("!") != -1) {
            count++;
        }
    }
    return count;
  }

  public static void makeUppercase(String[] wordList) {
    for (int i = 0; i < wordList.length; i++) {
        wordList[i] = wordList[i].toUpperCase();
    }
  }

  public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
    int[] bigInt = new int[intArr1.length];

    for (int i = 0; i < intArr1.length; i++) {
      if (intArr1[i] > intArr2[i]) {
        bigInt[i] = intArr1[i];
      }
      if (intArr1[i] < intArr2[i]) {
        bigInt[i] = intArr2[i];
      }
      else {
        bigInt[i] = intArr1[i];
      }

    }
    return bigInt;
  }

  public static int countConsecutiveDoubles(int[] numList) {
    int count = 0;

    for (int i = 0; i < numList.length - 1; i++) {
      if (numList[i] == numList[i+1]) {
        count++;
      }
    }
    return count;
  }


  public static int longestStreak(int[] nums) {
    int longStreak = 0;
    for (int i = 0; i < nums.length; i++) {
      int streak = 1;
      int idx = i;
      while (idx < nums.length - 1 && nums[idx] == nums[idx + 1]) {
        streak++;
        idx++;
      }

      if (streak > longStreak) {
        longStreak = streak;
      }
    }

    return longStreak;
  }



}