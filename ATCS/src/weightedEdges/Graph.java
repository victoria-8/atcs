package weightedEdges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class Graph {
	private TreeMap<String, ArrayList<Edge>> map;
	
	public Graph()
	{
		
	}
	//e.get(points) -> add each point to map + connected edges
	public void addEdge(Edge e){
		ArrayList<Edge> list = new ArrayList<Edge>();
		
		if(map==null)
			map=new TreeMap<String,ArrayList<Edge>>();
		
		if(contains(e.getPoints().substring(0,1))){
			list=map.get(e.getPoints().substring(0,1));
		}
		
		list.add(e);
		map.put(e.getPoints().substring(0,1),list);
	
		list = new ArrayList<Edge>();
		
		e.switchPoints();
		
		if(contains(e.getPoints().substring(0,1))){
			list=map.get(e.getPoints().substring(0,1));
		}
		
		list.add(e);
		map.put(e.getPoints().substring(0,1),list);
		
	}

	public boolean contains(String letter)
	{
	   return map.containsKey(letter);
	}
	
	
	public boolean directCheck(String first, String second){
		if(first.equals(second))
			return true;
		if(!map.containsKey(first)||!map.containsKey(second)){
			return false;
		}
		else{
			CharSequence x=second;
			
			ArrayList <Edge> a = map.get(first);
			ArrayList <Edge >b =map.get(second);
			for(int i=0; i<a.size(); i++){

				if(b.contains(a.get(i))){

					//System.out.println(first+" "+second);
					return true;
				}
			}
			return false;
			
		}
	}
	
	public boolean check(String first, String second, String placesUsed)
	{

		placesUsed+=first;
		
			if(directCheck(first,second)){
				return true;
			}
			else{
				ArrayList<Edge>x=map.get(first);
				if(x==null){
					return false;
				}
					
				for(int i=0;i<x.size();i++){
					if(!placesUsed.contains(x.get(i).getPoints().substring(1,2))){
						if(check(x.get(i).getPoints().substring(1,2),second,placesUsed)){
						
							return true;
						}
							
					}	
				}
				return false;
			}
	}
	
	//!!!!!!!!!!returns arraylist of edges now not String
	public ArrayList<Edge> findFewestMiles(String first, String second, String placesUsed) {
		
		placesUsed+=first;
		ArrayList<Edge> edges=map.get(first);
		
		if (directCheck(first, second)){

			for(int i=0; i<edges.size(); i++){
				if(edges.get(i).getPoints().contains(second)){
					ArrayList<Edge> x=new ArrayList();
					x.add(edges.get(i));
					return x;
				}
			}
		}
		
		ArrayList<Edge> pathOne=new ArrayList();
		ArrayList<Edge> pathTwo=new ArrayList();
	
		for(int i=0; i<edges.size(); i++){
			if((!placesUsed.contains(edges.get(i).getPoints().substring(1,2))) && 
				check(edges.get(i).getPoints().substring(1,2),second,placesUsed)){
				if(pathOne.size()==0){
					pathOne=findFewestMiles(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
				else{
					System.out.println("workdshjfkalhskfasdfs");
					pathTwo=findFewestMiles(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
					
			}
		}
		int pathOneMiles=0;
		int pathTwoMiles=0;
			if(pathOne.size()!=0 && pathTwo.size()!=0){
			
				for (int i=0; i<pathOne.size();i++)
				{
					pathOneMiles+=pathOne.get(i).getDistance();
				}
				
				for (int i=0; i<pathTwo.size();i++)
				{
					pathTwoMiles+=pathTwo.get(i).getDistance();
				}
				for (Edge q : pathOne)
					System.out.print(q + " ");
				System.out.println();
				for (Edge q : pathTwo)
					System.out.print(q + " ");
				
				if(pathOneMiles<pathTwoMiles){
					 pathOne.addAll(findFewestMiles(first,pathOne.get(pathOne.size()-1).getPoints().substring(1,2),""));
					return pathOne;
				}
				else{
					 pathTwo.addAll(findFewestMiles(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(1,2),""));
					return pathTwo;
				}
					
			}
			else if(pathTwo!=null&&pathTwo.size()!=0){
				pathTwo.addAll(findFewestMiles(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(0,1),""));
				return pathTwo;
			}
			else{
				 pathOne.addAll(findFewestMiles(first,pathOne.get(pathOne.size()-1).getPoints().substring(0,1),""));
					return pathOne;
			}
				
			
	}

public ArrayList<Edge> findQuickest(String first, String second, String placesUsed) {
		
		placesUsed+=first;
		ArrayList<Edge> edges=map.get(first);
		
		if (directCheck(first, second)){
			for(int i=0; i<edges.size(); i++){
				if(edges.get(i).getPoints().contains(second)){
					ArrayList<Edge> x=new ArrayList();
					x.add(edges.get(i));
					return x;
				}
			}
		}
		
		ArrayList<Edge> pathOne=new ArrayList();
		ArrayList<Edge> pathTwo=new ArrayList();
		
		for(int i=0; i<edges.size(); i++){
			if(!placesUsed.contains(edges.get(i).getPoints().substring(1,2)) && 
				check(edges.get(i).getPoints().substring(1,2),second,placesUsed)){
				if(pathOne==null){
					pathOne=findQuickest(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
					
				else{
					pathTwo=findQuickest(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
					
			}
		}
		
		int pathOneMiles=0;
		int pathTwoMiles=0;
		
			if(pathOne.size()!=0 && pathTwo.size()!=0){
				for (int i=0; i<pathOne.size();i++)
				{
					pathOneMiles+=pathOne.get(i).getTime();
				}
				
				for (int i=0; i<pathTwo.size();i++)
				{
					pathTwoMiles+=pathTwo.get(i).getTime();
				}
				for (Edge q : pathOne)
					System.out.print(q + " ");
				System.out.println();
				for (Edge q : pathTwo)
					System.out.print(q + " ");
				if(pathOneMiles<pathTwoMiles){
					 pathOne.addAll(findQuickest(first,pathOne.get(pathOne.size()-1).getPoints().substring(1,2),""));
					return pathOne;
				}
				else{
					 pathTwo.addAll(findQuickest(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(0,1),""));
					return pathTwo;
				}
					
			}
			else if(pathTwo!=null&&pathTwo.size()!=0){
				pathTwo.addAll(findQuickest(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(0,1),""));
				return pathTwo;
			}
			else{
				 pathOne.addAll(findQuickest(first,pathOne.get(pathOne.size()-1).getPoints().substring(0,1),""));
					return pathOne;
			}
				
			
	}

public ArrayList<Edge> findLeastExpensive(String first, String second, String placesUsed) {
		
		placesUsed+=first;
		ArrayList<Edge> edges=map.get(first);
		
		if (directCheck(first, second)){
			for(int i=0; i<edges.size(); i++){
				if(edges.get(i).getPoints().contains(second)){
					ArrayList<Edge> x=new ArrayList();
					x.add(edges.get(i));
					return x;
				}
			}
		}
		
		ArrayList<Edge> pathOne=new ArrayList();
		ArrayList<Edge> pathTwo=new ArrayList();
		
		for(int i=0; i<edges.size(); i++){
			if(!placesUsed.contains(edges.get(i).getPoints().substring(1,2)) && 
				check(edges.get(i).getPoints().substring(1,2),second,placesUsed)){
				if(pathOne==null){
					pathOne=findLeastExpensive(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
					
				else{
					pathTwo=findLeastExpensive(edges.get(i).getPoints().substring(1,2),second,placesUsed);
				}
					
			}
		}
		
		int pathOneMiles=0;
		int pathTwoMiles=0;
		
			if(pathOne.size()!=0 && pathTwo.size()!=0){
				for (int i=0; i<pathOne.size();i++)
				{
					pathOneMiles+=pathOne.get(i).getCost();
				}
				
				for (int i=0; i<pathTwo.size();i++)
				{
					pathTwoMiles+=pathTwo.get(i).getCost();
				}
				for (Edge q : pathOne)
					System.out.print(q + " ");
				System.out.println();
				for (Edge q : pathTwo)
					System.out.print(q + " ");
				if(pathOneMiles<pathTwoMiles){
					 pathOne.addAll(findLeastExpensive(first,pathOne.get(pathOne.size()-1).getPoints().substring(1,2),""));
					return pathOne;
				}
				else{
					 pathTwo.addAll(findLeastExpensive(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(0,1),""));
					return pathTwo;
				}
					
			}
			else if(pathTwo!=null&&pathTwo.size()!=0){
				pathTwo.addAll(findLeastExpensive(first,pathTwo.get(pathTwo.size()-1).getPoints().substring(0,1),""));
				return pathTwo;
			}
			else{
				 pathOne.addAll(findLeastExpensive(first,pathOne.get(pathOne.size()-1).getPoints().substring(0,1),""));
					return pathOne;
			}
				
			
	}


	public String toString() {
		
		return map.toString().replaceAll("\\,", "\n");
		
		
	}
}