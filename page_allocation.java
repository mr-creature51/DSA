public class page_allocation {
    1• For getting the lower limit and upper limit for our binary search. We have to calculate the maximum number of pages in one book (lower limit) and the sum of pages of all the books (upper limit).




2• Now, we apply binary search in this range and check if assignment of books to students for a given mid value is possible or not.




3• For checking if assignment of books to students for a given mid value is possible or not we used a function called ispossible. Here, we will try to assign books to some “st” number of students. If “st” number of students is less than or equal to our m students then it is possible to assign books to students for the given mid value.




4• After we have completed our binary search we will just return the answer.



}
// 