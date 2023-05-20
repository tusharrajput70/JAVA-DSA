
public class LL_SwapTwoNodes {
	private static class node{
		int data;
		node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	 private static node head=null;
	 private static node tail=null;
	 public static node size=null;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 private void addlast(int data) {//constant time complexity O(1);  
		//step1. create new node
		node newnode=new node(data);
		
		//special case
		if(head==null) {
			head=tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	 
	 
	 
	 private void print() {//O(n)
			node temp=head;
			if(head==null&&tail==null) {
				System.out.println("Linked List is empty");
			}
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next; 
			}
			System.out.println("null");
		}
	 
	 
		

		private node nodeAt(int i) {
			node temp=head;
			int k=0;
			while(k!=i) {
				temp=temp.next;
				k++;
			}
			return temp;
		}
		
		public void swapnodes(int i,int j) {
			if(nodeAt(i)==head&&nodeAt(j)==tail) {
				node first=nodeAt(i);
				node sec=nodeAt(j);
				node psec=nodeAt(j-1);
				sec.next=first.next;
				psec.next=first;
				first.next=null;
				head=sec;
				tail=first;
				return;
			}
			if(nodeAt(j)==head) {
				int temp=i;
				i=j;
				j=temp;
			}
			else if(nodeAt(j)==tail) {
				int temp=i;
				i=j;
				j=temp;
			}
			if(i==j) {
				return;
			}
			
			if(nodeAt(i)==head) {
				node first=nodeAt(i);
				node sec=nodeAt(j);
				node psec=nodeAt(j-1);
				node snext=sec.next;
				sec.next=first.next;
				first.next=snext;
				psec.next=first;
				head=sec;
				return;
			}
			if(nodeAt(i)==tail) {
				node first=nodeAt(i);
				node sec=nodeAt(j);
				node pfirst=nodeAt(i-1);
				node psec=nodeAt(j-1);
				node nsec=sec.next;
				sec.next=null;
				first.next=nsec;
				psec.next=first;
				pfirst.next=sec;
				tail=sec;
				return;
				
			}
			node first=nodeAt(i);
			node sec=nodeAt(j);
			node fprev=nodeAt(i-1);
			node sprev=nodeAt(j-1);
			sprev.next=null;
			fprev.next=sec;
			sec.next=first.next;
			sprev.next=first;
			first.next=null;
		}
		

		
	public static void main(String[] args) {
		LL_SwapTwoNodes ll=new LL_SwapTwoNodes();
		ll.addlast(8);
		ll.addlast(12);
		ll.addlast(10);
		ll.addlast(5);
		ll.addlast(4);
		ll.addlast(1);
		ll.addlast(6);
		ll.print();
		ll.swapnodes(4, 3);
		ll.print();
		
	}

}
