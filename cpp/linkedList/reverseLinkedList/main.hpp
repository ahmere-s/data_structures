//Definition for singly-linked list

struct listNode{
  
    int value;
  
    listNode* next;
  
    listNode() : value(0), next(nullptr){}
    listNode(int x) : value(x), next(nullptr){}
    listNode(int x, listNode* next) : value(x), next(next){}

};

class Solution{
public:
    listNode* reverseList(listNode* head){
        listNode* current = head;
	listNode* previous = nullptr;

	while(current != nullptr){
	    listNode* next = current -> next; //the save
	    current -> next = previous; //the reverse
	    previous = current; //shift the previous location
            current = next; //shift current location
	}
	return previous;
    }
};
