package ru.zlygostev;

import org.junit.Test;
import ru.zlygostev.Database.ProjectDAO;
import ru.zlygostev.dto.ProjectDTO;

import java.util.List;

public class ProjectTest {

    @Test
    public void test() throws Exception {
        final ProjectDAO projectDAO = new ProjectDAO();
        projectDAO.getManager().connect();

        final List<ProjectDTO> projects = projectDAO.findAll();
        System.out.println(projects);

        projectDAO.getManager().disconnect();

    }
}
