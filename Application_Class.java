package Project_CS201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import Project_CS201.LLNode;

public class Application_Class {
	// Read file and insert into ArrayList
	public static SSBU_Character[] readFileAL(String fileName) throws FileNotFoundException {
		
		SSBU_Character[] list = new SSBU_Character[86];
		
		File database = new File(fileName);
		Scanner input = new Scanner(database);
		String line = "";
		int counter = 0;
		
		// Creates employee objects from file until it has no more lines to read from. It then inserts into ArrayList
		while (input.hasNextLine()) {
			line = input.nextLine();
			String[] values = line.split(",");
			SSBU_Character a = new SSBU_Character();
			a.setName(values[0]);
			a.setGame(values[1]);
			a.setId(Integer.parseInt(values[2]));
			
			list[counter] = a;
			counter++;
			
		}	
		input.close();
		return list;
	}
	// Read file and insert into LinkedList
	public static MyLinkedList readFileLL(String fileName) throws FileNotFoundException {
		
		MyLinkedList list = new MyLinkedList();
		
		File database = new File(fileName);
		Scanner input = new Scanner(database);
		String line = "";
		
		// Creates employee objects from file until it has no more lines to read from. It then inserts into LinkedList
		while (input.hasNextLine()) {
			line = input.nextLine();
			String[] values = line.split(",");
			SSBU_Character a = new SSBU_Character();
			a.setName(values[0]);
			a.setGame(values[1]);
			a.setId(Integer.parseInt(values[2]));
			list.add(a);
			
		}	
		input.close();
		return list;
	}
	// Read file and insert into BinarySearchTree
	public static BinaryTree readFileTree(String fileName) throws FileNotFoundException {
	
		BinaryTree list = new BinaryTree();
	
		File database = new File(fileName);
		Scanner input = new Scanner(database);
		String line = "";
		
		// Creates employee objects from file until it has no more lines to read from. It then inserts into Binary Search Tree
		while (input.hasNextLine()) {
			line = input.nextLine();
			String[] values = line.split(",");
			SSBU_Character a = new SSBU_Character();
			a.setName(values[0]);
			a.setGame(values[1]);
			a.setId(Integer.parseInt(values[2]));
		
			list.addTreeNode(a);
		
		}	
		input.close();
		return list;
	}
	
	public static SSBU_Character[] sortArray(SSBU_Character[] list) {
		
		for (int i=1;i<list.length;i++) {
			while (i>0 && list[i].getId() < list[i-1].getId()) {
				SSBU_Character temp = list[i-1];
				list[i-1] = list[i];
				list[i] = temp;
				i--;
			}
	}
		return list;
	}
	
public static int[] sortArrayNum(int[] list) {
		
		for (int i=1;i<list.length;i++) {
			while (i>0 && list[i] < list[i-1]) {
				int temp = list[i-1];
				list[i-1] = list[i];
				list[i] = temp;
				i--;
			}
	}
		return list;
	}
	
	public static String arraySequentialSearch(int value, SSBU_Character[] list) {
		long start = System.nanoTime();
		boolean searching = true;
		int counter = 0;
		String location = "";

		while(searching && counter<list.length) {
			if(list[counter].getId()==value) {
				long end = System.nanoTime();
				long time = end-start;
				return location = (list[counter].getName() + " with ID: " + value + " was found at element " + counter + " in " + time + " milliseconds using an array sequential search.");
			} else {
				counter++;
			}
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
		
	}
	
	public static String arraySequentialSearchNum(int value, int[] list) {
		long start = System.nanoTime();
		boolean searching = true;
		int counter = 0;
		String location = "";

		while(searching && counter<list.length) {
			if(list[counter]==value) {
				long end = System.nanoTime();
				long time = end-start;
				return location = ( value + " was found at element " + counter + " in " + time + " milliseconds using an array sequential search.");
			} else {
				counter++;
			}
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
		
	}
	
	public static String linkedListSequentialSearch(int value, MyLinkedList list) {
		long start = System.nanoTime();
		String location = "";
		LLNode currNode = list.head;
		int counter = 0;
		
		while(currNode != null) {
			
			if(currNode.info.getId()==value) {
				long end = System.nanoTime();
				long time = end-start;
				return location = (currNode.info.getName() + " with ID: " + value + " was found at node " + counter + " in " + time + " milliseconds using LL sequential search.");
			} else {
				currNode = currNode.next;
				counter++;
			}
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
	}
	
	public static String linkedListSequentialSearchNum(int value, MyLinkedList list) {
		long start = System.nanoTime();
		String location = "";
		LLNode currNode = list.head;
		int counter = 0;
		
		while(currNode != null) {
			
			if(currNode.infoNum==value) {
				long end = System.nanoTime();
				long time = end-start;
				return location = (value + " was found at node " + counter + " in " + time + " milliseconds using LL sequential search.");
			} else {
				currNode = currNode.next;
				counter++;
			}
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
	}
	
	public static String arrayBinarySearch(int value, SSBU_Character[] list, int start, int end) {
		long tStart = System.nanoTime();
		boolean found = false;
		String location = "";
		
		
		
		while (!found && start != end) {
			int middle = (start + end)/2;
			if (value==(list[middle].getId())) {
				long tEnd = System.nanoTime();
				long time = tEnd-tStart;
				return location = (list[middle].getName() + " with ID: " + value + " was found at element " + middle + " in " + time + " milliseconds using an array binary search.");
			} else if (value < (list[middle].getId())) {
				end = middle;
			} else {
				start = middle + 1;
			}
		}
		long tEnd = System.nanoTime();
		long time = tEnd-tStart;
		return location = "Character not found after " + time + " milliseconds.";
	}
	
	public static String arrayBinarySearchNum(int value, int[] list, int start, int end) {
		long tStart = System.nanoTime();
		boolean found = false;
		String location = "";
		
		
		
		while (!found && start != end) {
			int middle = (start + end)/2;
			if (value==(list[middle])) {
				long tEnd = System.nanoTime();
				long time = tEnd-tStart;
				return location = (value + " was found at element " + middle + " in " + time + " milliseconds using an array binary search.");
			} else if (value < (list[middle])) {
				end = middle;
			} else {
				start = middle + 1;
			}
		}
		long tEnd = System.nanoTime();
		long time = tEnd-tStart;
		return location = "Character not found after " + time + " milliseconds.";
	}
	
	public static String treeBinarySearch(int value, TreeNode tree) {
		long start = System.nanoTime();
		String location = "";
		TreeNode currNode = tree;
		
		while(currNode != null) {
			if(currNode.info.getId()==value) {
				long end = System.nanoTime();
				long time = end-start;
			
				return location = (currNode.info.getName() + " with ID: " + value + " was found in " + time + " milliseconds using a tree binary search.");
			} else if(currNode.info.getId() > value) {
				currNode = currNode.left;
			} else if(currNode.info.getId() < value) {
				currNode = currNode.right;
			}
			
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
	} 
	
	public static String treeBinarySearchNum(int value, TreeNode tree) {
		long start = System.nanoTime();
		String location = "";
		TreeNode currNode = tree;
		
		while(currNode != null) {
			if(currNode.infoNum==value) {
				long end = System.nanoTime();
				long time = end-start;
			
				return location = (value + " was found in " + time + " milliseconds using a tree binary search.");
			} else if(currNode.infoNum > value) {
				currNode = currNode.left;
			} else if(currNode.infoNum < value) {
				currNode = currNode.right;
			}
			
		}
		long end = System.nanoTime();
		long time = end-start;
		return location = "Character not found after " + time + " milliseconds.";
	} 
	
	public static void main(String[] args) throws FileNotFoundException {
			
			SSBU_Character[] unsortedArrayList = readFileAL("src/Project_CS201/Smash_Data.txt");
			MyLinkedList unsortedLinkedList = readFileLL("src/Project_CS201/Smash_Data.txt");
			BinaryTree tree = readFileTree("src/Project_CS201/Smash_Data.txt");
			SSBU_Character[] sortedArrayList = sortArray(readFileAL("src/Project_CS201/Smash_Data.txt"));
			MyLinkedList sortedLinkedList = readFileLL("src/Project_CS201/Smash_Data.txt");
			sortedLinkedList.insertionSort(sortedLinkedList.head);
			
			int[] unsortedArrayListNum = new int[2000];
			MyLinkedList unsortedLinkedListNum = new MyLinkedList();
			BinaryTree treeNum = new BinaryTree();
			int[] sortedArrayListNum = new int[2000];
			MyLinkedList sortedLinkedListNum = new MyLinkedList();
					
			boolean done = false;
			
			System.out.println(" - Search Algorithm Comparison Program - ");
			
			while(!done) {
				System.out.println();
				System.out.println("1. Print data");
				System.out.println("2. Search data(Smash Bros characters)");
				System.out.println("3. Search data(Random integer)");
				System.out.println("4. Exit program");
				
				Scanner input = new Scanner(System.in);
				String value = input.nextLine();
				try {
				int num = Integer.parseInt(value);
				
				
				switch(num) {
				
				case 1:
					System.out.println("Which data structure would you like to print from?");
					System.out.println();
					System.out.println("1. Unsorted array");
					System.out.println("2. Sorted array");
					System.out.println("3. Unsorted linked list");
					System.out.println("4. Sorted linked list");
					System.out.println("5. Binary search tree");
					
					Scanner input2 = new Scanner(System.in);
					String value2 = input.nextLine();
					int num2 = Integer.parseInt(value2);
					
					switch(num2) {
					
					case 1:
						for(int i=0;i<unsortedArrayList.length;i++) {
							System.out.println(unsortedArrayList[i]);
						}
						break;
					case 2:
						for(int i=0;i<sortedArrayList.length;i++) {
							System.out.println(sortedArrayList[i]);
						}
						
						break;
					case 3:
						 LLNode currNode = unsortedLinkedList.head;
						 //traverse through list and print
						 while(currNode != null) {
							 System.out.println(currNode.info);
							 currNode = currNode.next;
						 }
						 
						break;
					case 4:
						 LLNode currNode2 = sortedLinkedList.head;
						 //traverse through list and print
						 while(currNode2 != null) {
							 System.out.println(currNode2.info);
							 currNode2 = currNode2.next;
						 }
						 
						break;
					case 5:
						System.out.println();
						System.out.println("1. Inorder Traversal");
						System.out.println("2. Preorder Traversal");
						System.out.println("3. Postorder Traversal");
						
						Scanner inputTree = new Scanner(System.in);
						String valueTree = input.nextLine();
						int findNumTree = Integer.parseInt(valueTree);
						
						switch(findNumTree) {
						
						case 1:
							tree.inorderTraversal(tree.root);
							break;
						case 2:
							tree.preorderTraversal(tree.root);
							break;
						case 3:
							tree.postorderTraversal(tree.root);
							break;
						default:
							System.out.println("Invalid option. Returning to main menu...");
							break;
						}
						
						tree.inorderTraversal(tree.root);
						break;
					default:
						System.out.println("Invalid option. Returning to main menu...");
					} 
					break;
					
				case 2:
					System.out.println();
					System.out.println("Please enter an ID(1-86) of the Smash Ultimate character you'd like to find.");
					System.out.println("ID:86 is the most recently released character and ID:1 is the first character released");
					
					Scanner input3 = new Scanner(System.in);
					String value3 = input.nextLine();
					int findNum = Integer.parseInt(value3);
					
					System.out.println("Which data structure would you like to search from?");
					System.out.println();
					System.out.println("1. Unsorted array using sequential search");
					System.out.println("2. Sorted array using sequential search");
					System.out.println("3. Unsorted linked list using sequential search");
					System.out.println("4. Sorted linked list using sequential search");
					System.out.println("5. Sorted array using binary search");
					System.out.println("6. Binary search tree using binary search");
					System.out.println("7. All of the above");
					
					Scanner input4 = new Scanner(System.in);
					String value4 = input.nextLine();
					int num4 = Integer.parseInt(value4);
					
					switch(num4) {
					
					case 1:
						System.out.println(arraySequentialSearch(findNum, unsortedArrayList));
						break;
					case 2:
						System.out.println(arraySequentialSearch(findNum, sortedArrayList));
						break;
					case 3:
						System.out.println(linkedListSequentialSearch(findNum, unsortedLinkedList));
						break;
					case 4:
						System.out.println(linkedListSequentialSearch(findNum, sortedLinkedList));
						break;
					case 5:
						System.out.println(arrayBinarySearch(findNum, sortedArrayList,0,sortedArrayList.length));
						break;
					case 6:
						System.out.println(treeBinarySearch(findNum, tree.root));
						break;
					case 7:
						
						System.out.println(arraySequentialSearch(findNum, unsortedArrayList));
						System.out.print(arraySequentialSearch(findNum, sortedArrayList));
						System.out.println("(sorted array)");
						System.out.println(linkedListSequentialSearch(findNum, unsortedLinkedList));
						System.out.print(linkedListSequentialSearch(findNum, sortedLinkedList));
						System.out.println("(sorted linked list)");
						System.out.println(arrayBinarySearch(findNum, sortedArrayList,0,sortedArrayList.length));
						System.out.println(treeBinarySearch(findNum, tree.root));
						break;
					default:
						System.out.println("Invalid option. Returning to main menu...");
					}
					break;
					
				case 3:
					System.out.println();
					System.out.println("Please enter an integer between 1-999,999 that you'd like to search for.");
					System.out.println("A new dataset of 2000 integers is made after every execution.");
					
					Scanner input5 = new Scanner(System.in);
					String value5 = input.nextLine();
					int findRandNum = Integer.parseInt(value5);
					
					System.out.println("Which data structure would you like to search from?");
					System.out.println();
					System.out.println("1. Unsorted array using sequential search");
					System.out.println("2. Sorted array using sequential search");
					System.out.println("3. Unsorted linked list using sequential search");
					System.out.println("4. Sorted linked list using sequential search");
					System.out.println("5. Sorted array using binary search");
					System.out.println("6. Binary search tree using binary search");
					System.out.println("7. All of the above");
					
					Scanner input6 = new Scanner(System.in);
					String value6 = input.nextLine();
					int num6 = Integer.parseInt(value6);
					
					switch(num6) {
					
					case 1:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							unsortedArrayListNum[i] = numRand;
						}
						
						System.out.println(arraySequentialSearchNum(findRandNum, unsortedArrayListNum));
						break;
					case 2:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							sortedArrayListNum[i] = numRand;
						}
						sortedArrayListNum = sortArrayNum(sortedArrayListNum);
						
						System.out.println(arraySequentialSearchNum(findRandNum, sortedArrayListNum));
						
						break;
					case 3:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							unsortedLinkedListNum.add(numRand);
						}
						
						System.out.println(linkedListSequentialSearchNum(findRandNum, unsortedLinkedListNum));
						
						break;
					case 4:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							sortedLinkedListNum.add(numRand);
						}
						sortedLinkedListNum.insertionSortNum(sortedLinkedListNum.head);
						
						System.out.println(linkedListSequentialSearchNum(findRandNum, sortedLinkedListNum));
						break;
					case 5:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
						
							sortedArrayListNum[i] = numRand;
						}
						sortedArrayListNum = sortArrayNum(sortedArrayListNum);
						
						System.out.println(arrayBinarySearchNum(findRandNum, sortedArrayListNum,0,sortedArrayListNum.length));
						break;
					case 6:
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							treeNum.addTreeNodeNum(numRand);
						}
						
						System.out.println(treeBinarySearchNum(findRandNum, treeNum.root));
						break;
					case 7:
						
						for(int i=0;i<2000;i++) {
							Random random = new Random();
							
							int numRand = random.nextInt(999999);
							unsortedLinkedListNum.add(numRand);
							sortedLinkedListNum.add(numRand);
							treeNum.addTreeNodeNum(numRand);
							unsortedArrayListNum[i] = numRand;
							sortedArrayListNum[i] = numRand;
						}
						sortedLinkedListNum.insertionSortNum(sortedLinkedListNum.head);
						sortedArrayListNum = sortArrayNum(sortedArrayListNum);
						
						System.out.println(arraySequentialSearchNum(findRandNum, unsortedArrayListNum));
						System.out.print(arraySequentialSearchNum(findRandNum, sortedArrayListNum));
						System.out.println("(sorted array)");
						System.out.println(linkedListSequentialSearchNum(findRandNum, unsortedLinkedListNum));
						System.out.print(linkedListSequentialSearchNum(findRandNum, sortedLinkedListNum));
						System.out.println("(sorted linked list)");
						System.out.println(arrayBinarySearchNum(findRandNum, sortedArrayListNum,0,sortedArrayListNum.length));
						System.out.println(treeBinarySearchNum(findRandNum, treeNum.root));
						break;
					default:
						System.out.println("Invalid option. Returning to main menu...");
					}
					break;
				case 4:
					done = true;
				}
				} catch(NumberFormatException e) {
					System.out.println("That is not an integer. Please try again...");
				}
			}
			System.out.println("Thank you and have a great day!");
			
	}
	
}
	
