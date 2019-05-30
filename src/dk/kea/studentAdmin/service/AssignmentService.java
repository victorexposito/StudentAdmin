
package kea.studentAdmin.service;

import kea.studentAdmin.model.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService {

    private static AssignmentService mySelf = new AssignmentService();

    private List<Assignment> assignments = new ArrayList<>();

    private AssignmentService() {
    }

    public static AssignmentService getAssignmentService() {
        return mySelf;
    }

    public boolean addAssignment(Assignment assignment) {
        return assignments.add(assignment);
    }

    public boolean removeAssignment(Assignment a) {

        return assignments.remove(a);
    }

    public List<Assignment> getAssignmentList() {
        return new ArrayList<>(assignments);
    }

    public Assignment getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}