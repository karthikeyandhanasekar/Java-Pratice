
class  node 
{
    int data;
    node next;
   node(int val)
    {
        data = val;
        next = null;
    }
};
 class list
{
    node head = null;
node list2 = null;
node finallist = null;
node sllinsert(node head1,int val)
{
     head = head1;
    node n =  new node(val);
    if(head == null)
    {
        head = n;
        return head;
    }
    else
    {
    node temp = head;
    while(temp.next != null)
    {
     temp=temp.next;   
    }
    temp.next = n;
    return head;
    }
}
int listlength()
{
    int count =0;
    node temp = head;
    while(temp!= null)
    {
        count+=1;
        temp = temp.next;
    }
    return count;
}
node seperate()
{
    node temp = head;
    for(int i=1;i <listlength()/2 ;i++)
    {
        temp= temp.next;
    }
    list2 = temp.next;
    temp.next = null;
    return list2;

}
node reverse(node head)
{
    node current = head , prev = null, temp;
    while(current != null)
    {
        temp= current.next;
        current.next = prev;
       prev = current;
       current = temp;
    }
    return prev;
}
void display(node temp)
{

    while(temp!= null)
    {
       System.out.println(temp.data);
        temp = temp.next;
    }
}
node merge(node list1,node list2)
{
    node temp = list1 , temp1 = list2;
    int i=0;
    while(temp != null || temp1 != null)
    {
        finallist = sllinsert(temp,temp.data);
        finallist = sllinsert(temp1,temp1.data);
        temp=temp.next;
        temp1 = temp1.next;
    }
return finallist;
}
};
    
public class main
{ 
    public static void main(String args[])
    {

        list l = new list();
        node head = null;
        
    for(int i=1;i<7;i++)
    {
        l.head = l.sllinsert(l.head,i);
    }
    node list2 = l.seperate();
    list2 = l.reverse(list2);
    list2 = l.merge(l.head,list2);
            System.out.println("Count is " + l.listlength()) ;

    l.display(list2);


    System.out.println("Count is " + l.listlength()) ;
    }
}
