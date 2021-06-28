
// Input: l1 = [1,2,4], l2 = [1,3,4]
// Output: [1,1,2,3,4,4]







class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(!l1 && !l2) //<--- if both empty
            return l1;
        if(l1 && !l2) //<---- if l1 is not empty and l2 is empty
            return l1;
        if(!l1 && l2) //<---- if l2 is not empty and l1 is empty
            return l2;
        
        ListNode* i = l1;
        ListNode* j = l2;
        ListNode* c = i->val < j->val ? i : j;
        ListNode* r = c;
        //setting up first node
        if(i->val < j->val)
            i = i->next;
        else
            j = j->next;
        
        while(i && j) //<----- exhausting one list
        {
            if(i->val < j->val)
            {
                c->next = i;
                i = i->next;
                c = c->next;
            }
            else
            {
                c->next = j;
                j = j->next;
                c = c->next;
            }
        }
        
		//only 1 one of these loops will be traversed
		//i loop will execute if j list was exhausted and vice versa
        while(i)
        {
            c->next = i;
            i = i->next;
            c = c->next;
        }
        
        while(j) 
        {
            c->next = j;
            j = j->next;
            c = c->next;
        }
        
        return r;
    }
};
