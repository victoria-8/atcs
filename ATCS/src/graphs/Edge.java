package graphs;

public class Edge {
private int cost;
private int distance;
private int time;
private String vertices;
public Edge(int cost, int distance, int time, String points) {
	this.cost = cost;
	this.distance = distance;
	this.time = time;
	vertices=points;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}
public String getPoints()
{
	return vertices;
}
public void switchPoints(){
	vertices=vertices.substring(1)+vertices.substring(0,1);
}
public String toString()
{
	return vertices + " ";
}
}