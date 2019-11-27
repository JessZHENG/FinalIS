package com.example.better;

import com.example.better.entity.DataTable;
import com.example.better.entity.Project;
import com.example.better.entity.Relation;
import com.example.better.service.DataTableService;
import com.example.better.service.ProjectService;
import com.example.better.service.RelationService;
import com.example.better.service.TattributeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BetterApplicationTests {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private DataTableService dataTableService;
    @Autowired
    private RelationService relationService;
    @Autowired
    private TattributeService tattributeService;

    @Test
    public void testProject(){
        Project project=new Project("test3","Success???");
        System.out.println(projectService.saveNewProject(project).toString());
    }
    @Test
    public void testDeleteProject(){
        long id=1;
        projectService.removeProject(id);
    }

    @Test
    public void testTable(){
        DataTable dataTable =new DataTable("test3","无2","kong", 00000000000000000003);
        System.out.println(dataTableService.saveNewTable(dataTable));
    }
    @Test
    public void testTableById(){
        long projectId=2;
        System.out.println(dataTableService.selectTableById(projectId).toString());
    }

    @Test
    public void testRelation(){
       Relation relation =new Relation("test","Success?",00000000000000000001,00000000000000000002);
       System.out.println(relationService.saveNewRelation(relation));
    }

    @Test
    @AutoConfigureTestDatabase
    public void contextLoads() {

    }

}
