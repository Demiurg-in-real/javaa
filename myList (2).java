import java.util.myList;

class mylist {
        myList First;
        myList Last;
	myList i;

        public  void  main(String args []) {
                myList list = new myList();
        }


class myList {

	myList() {
		

	}

	
	myList(myList First, myList Last) {
		this.First = First;
		this.Last = Last;	
	}
	
        public void add() {
		myList list = new myList();
                list.add("b");
                list.add("c");
                list.add("d");
                list.add("e");
                list.add("f");
                list.addFirst("a");
                list.addLast("z");
                System.out.println("Добавили элемент z в конец , теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.lenght );
                System.out.println("Добавили элемент а в начало, теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.length );
        }

/*
        public void addFirst() {
		myList list = new myList();

                list.addFirst("a");
                System.out.println("Добавили элемент а в начало, теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.size() );

        }
        public void addLast() {
		myList list = new myList();
                list.addLast("z");
                System.out.println("Добавили элемент z в конец , теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.size() );

        }
*/
        public void size() {
		
                myList list  = new myList();
                System.out.println("количество эл-в в списке: " + list.size() );
        }

        public void remove() {
		myList list = new myList();
                list.remove(2);
                System.out.println("количество эл-в в списке: " + list.lenght );

                for (i = 0 ; i < list.lenght ; i++) {
                        list.remove(i);
                }

       
                System.out.println("Удалили все , теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.lenght );

        }

/*
        public static void dellall() {
		myList list = new myList();

                for (a = 0 ; a < list.lenght ; a++) {
                        list.remove(a);
                }

                // for (element = 0 ;  element != null ; element ++ )
                //       element.remove();
                //       System.out.println("Удален элемент: " + element );

                //else if
                //{
                        //System.out.println("Элементов нет");

                //}
                System.out.println("Удалили все , теперь исходное значение списка: " + list );
                System.out.println("Размер списка: " + list.lenght );
        }
*/
}
                                                                                                                                     

