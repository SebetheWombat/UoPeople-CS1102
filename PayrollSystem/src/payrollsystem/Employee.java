/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Sebe
 */
public abstract class Employee {
    private int empID;
    private String name;
    private Vehicle vehicle;
    
    public Employee(){
        //System.out.println(".. inside default constructor");
        empID = 0;
        name = "";
    }
    
    //With vehicle already created
    public Employee(int pEmpId, String pName, Vehicle pV){
        //System.out.println(".. inside Employee non-default constructor");
        empID = pEmpId;
        name = pName;
        this.vehicle = pV;
    }
    
    //Create vehicle with employee
    public Employee(int pEmpId, String pName, String pPlate, String pColor){
        System.out.println(".. inside Employee non-default constructor");
        empID = pEmpId;
        name = pName;
        this.vehicle = new Vehicle(pPlate, pColor);
    }

    public abstract double calculatePay();
    
    /**
     * @return the empID
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
