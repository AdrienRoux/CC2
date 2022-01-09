package fr.esgi.archi_logicielle_cc2.myApp.application;

import fr.esgi.archi_logicielle_cc2.kernel.Command;
import fr.esgi.archi_logicielle_cc2.myApp.domain.Location;
import fr.esgi.archi_logicielle_cc2.myApp.domain.Project;
import fr.esgi.archi_logicielle_cc2.myApp.domain.Skills;

import java.util.Date;
import java.util.List;

@SuppressWarnings("all")
public final class CreateContractor implements Command {

    public final String firstName;
    public final String lastName;
    public final Date birthdate;
    public final boolean validate;
    public final Location address;
    public final List<Project> projects;
    public final List<Skills> skills;
    public final float adr;
    public final String job;


    public CreateContractor(String firstName, String lastName,
                            Date birthdate, boolean validate,
                            Location address, List<Project> projects,
                            List<Skills> skills, float adr, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.validate = validate;
        this.address = address;
        this.projects = projects;
        this.skills = skills;
        this.adr = adr;
        this.job = job;
    }
}
