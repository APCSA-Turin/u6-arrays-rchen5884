public class ArrayManipulator {

    // instance variables
    private int[] nums;
    private String[] words;

    /** Constructor that returns a new ArrayManipulator
     *  @param nums  The array of nums
     *  @param howManyStrings  How many elements to put in the words array
     */
    public ArrayManipulator(int[] nums, int howManyStrings) {
        this.nums = nums;
        this.words = new String[howManyStrings];
    }

    /** Returns the index of the middle element of nums; if the length of the list
     *  is even, should return the index of the earlier middle element
     *  Precondition: length of nums >= 3
     *
     *  @return  the index of the middle element of nums
     */
    public int getNumsMiddleIndex() {
        return (nums.length - 1) / 2;
    }

    /** Returns the average, as a double, of the average of the first, last, and
     *  middle elements of nums; the middle element should be the element at the
     *  index determined by getNumsMiddleIndex
     *
     *  @return  the average of the first, last, and middle elements
     */
    public double getNumsAverage() {
        int middleIndex = getNumsMiddleIndex();
        return (nums[0] + nums[middleIndex] + nums[nums.length - 1]) / 3.0;
    }

    /** Returns true if both the nums and words arrays have the same number of
     *  elements, returns false otherwise.
     *
     *  @return  returns true if the two arrays are equal in length; false if not
     */
    public boolean sameLengths() {
        return nums.length == words.length;
    }

    /** Updates the element of the words array at index idx to the new value
     *  provided and returns true to indicate a successful update; if, however,
     *  idx exceeds the bounds of the words array, do NOT update the array and
     *  return false to indicate that the update was unsuccessful.
     *
     *  @return  true if the update was successful, false otherwise.
     */
    public boolean updateWordsListAt(int idx, String newValue) {
        if (idx >= 0 && idx < words.length) {
            words[idx] = newValue;
            return true;
        }
        return false;
    }

    /** Returns the number of characters that are contained in the last element of
     *  the words list; however, if the last element of the array is null return 0
     *
     *  @return  how many characters are in the last element of words; 0 if the
     *           last element is null
     */
    public int howLongLastWord() {
        if (words[words.length - 1] != null) {
            return words[words.length - 1].length();
        }
        return 0;
    }

    /** Returns the int in the nums array located at the specified index
     *  PRECONDITION:  assume idx < length of nums
     *
     *  @return  the int in the nums array located at index idx
     */
    public int getNumAt(int idx) {
        return nums[idx];
    }

    /** Returns the String in the words array located at the specified index
     *  PRECONDITION:  assume idx < length of words
     *
     *  @return  the String in the words array located at index idx
     */
    public String getWordAt(int idx) {
        return words[idx];
    }
}