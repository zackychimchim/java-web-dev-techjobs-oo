package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJobC = new Job("Product tester", new Employer("ACME"), new Location("Desert"),new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test

    public void testSettingJobId() {
        Job testJobA = new Job();
        Job testJobB = new Job();
        assertTrue((testJobB.getId()-testJobA.getId() == 1));
    }

    @Test
    public void testEmployerAssignment() {
        assertTrue(testJobC.getEmployer() instanceof Employer);
    }

    @Test
    public void testLocationAssignment() {
        assertTrue(testJobC.getLocation() instanceof Location);
    }

    @Test
    public void testPositionTypeAssignment() {
        assertTrue(testJobC.getPositionType() instanceof PositionType);
    }

    @Test
    public void testCoreCompetencyAssignment() {
        assertTrue(testJobC.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job testJobD = new Job("Product tester", new Employer("ACME"), new Location("Desert"),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobE = new Job("Product tester", new Employer("ACME"), new Location("Desert"),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJobD.getId() == testJobE.getId());
    }

    @Test
    public void toStringReturnsBlankLineBeforeJobInfo() {
        assertEquals(0,testJobC.toString().indexOf("\n"));
    }

    @Test
    public void toStringReturnsIdLabel() {
        assertTrue(testJobC.toString().contains("ID: "));
    }

    @Test
    public void toStringReturnsNameLabel() {
        assertTrue(testJobC.toString().contains("Name: "));
    }

    @Test
    public void toStringReturnsEmployerLabel() {
        assertTrue(testJobC.toString().contains("Employer: "));
    }

    @Test
    public void toStringReturnsLocationLabel() {
        assertTrue(testJobC.toString().contains("Location: "));
    }

    @Test
    public void toStringReturnsPositionTypeLabel() {
        assertTrue(testJobC.toString().contains("Position Type: "));
    }

    @Test
    public void toStringReturnsCoreCompetencyLabel() {
        assertTrue(testJobC.toString().contains("Core Competency: "));
    }

    @Test
    public void toStringReturnsAllOfJobFieldsWithLabelsAndSpaces() {
        assertEquals("\n"+ "ID: "+ 2 + "\nName: " + "Product tester" + "\nEmployer: " + "ACME" + "\nLocation: " + "Desert" + "\nPosition Type: " + "Quality control" + "\nCore Competency: " + "Persistence" + "\n", testJobC.toString() );
    }

    @Test
    public void testIfFieldEmptyNameReturnsEmptyStatement() {
        Job testJobF = new Job("", new Employer("ACME"),  new Location("Desert"),  new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\n"+ "ID: "+ 6 + "\nName: " + "Data not available" + "\nEmployer: " + "ACME" + "\nLocation: " + "Desert" + "\nPosition Type: " + "Quality control" + "\nCore Competency: " + "Persistence" + "\n", testJobF.toString());
    }

    @Test
    public void testIfFieldEmptyEmployerReturnsEmptyStatement() {
        Job testJobF = new Job("Product tester", new Employer(""),  new Location("Desert"),  new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\n"+ "ID: "+ 12 + "\nName: " + "Product tester" + "\nEmployer: " + "Data not available" + "\nLocation: " + "Desert" + "\nPosition Type: " + "Quality control" + "\nCore Competency: " + "Persistence" + "\n", testJobF.toString());
    }

}
