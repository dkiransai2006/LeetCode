/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* a = head;

    int i, count = 0;
    while(a != NULL)
    {
        count += 1;
        a = a->next;
    }
    

    if(count != 0){
        int arr[count];

        a = head;

        for(i = 0; i < count; i++)
        {
            arr[i] = a->val;
            a = a->next;
        }

        a = head;
        for(i = 0; i < count; i++)
        {
            a->val = arr[count-i-1];
            a = a->next;
        }
    }
    else{
        printf("0");
    }
    return head;
}
