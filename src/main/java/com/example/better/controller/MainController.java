package com.example.better.controller;

import com.example.better.entity.DataTable;
import com.example.better.entity.Project;
import com.example.better.entity.Relation;
import com.example.better.entity.Tattribute;
import com.example.better.service.DataTableService;
import com.example.better.service.ProjectService;
import com.example.better.service.RelationService;
import com.example.better.service.TattributeService;
import com.example.better.vo.Response;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/function")
public class MainController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private DataTableService dataTableService;
    @Autowired
    private RelationService relationService;
    @Autowired
    private TattributeService tattributeService;


    /**
     * 测试页
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @GetMapping("/")
    public ModelAndView function(Model model){
        List<Project> projectList = projectService.selectAllProject();
        model.addAttribute("projectList",projectList);
        return new ModelAndView("function","Model",model);
    }

    @GetMapping("/tableList")
    public ResponseEntity<Response> listTableByProjectId(long projectId) {
        List<DataTable> dataTableList=null;
        try {
            dataTableList=dataTableService.selectTableById(projectId);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(dataTableList).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

    @GetMapping("/tattributeList")
    public ResponseEntity<Response> listtattributeByTableId(long tableId) {
        List<Tattribute> tattributeList=null;
        try {
            tattributeList=tattributeService.selectTattributeByTableId(tableId);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(tattributeList).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

    @GetMapping("/relationList")
    public ResponseEntity<Response> listRelationByTableId(long tableId) {
        List<Relation> relationList=null;
        try {
            relationList=relationService.findRelativeTableList(tableId);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(relationList).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

    @GetMapping("/newProject")
    public ModelAndView newProject(Project project,Model model){
        projectService.saveNewProject(project);
        List<Project> projectList = projectService.selectAllProject();
        model.addAttribute("projectList",projectList);
        return new ModelAndView("function","Model",model);
    }

    @GetMapping("/newTable")
    public ResponseEntity<Response> newTable(DataTable dataTable) {
        DataTable dataTable1=null;
        try {
            dataTable1=dataTableService.saveNewTable(dataTable);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(dataTable1).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

    @GetMapping("/newAttribute")
    public ResponseEntity<Response> newAttribute(Tattribute tattribute) {
        Tattribute tattribute1=null;
        try {
            tattribute1=tattributeService.saveNewTattribute(tattribute);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(tattribute1).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

    @GetMapping("/newRelation")
    public ResponseEntity<Response> newAttribute(Relation relation) {
        Relation relation1=null;
        try {
            relation1=relationService.saveNewRelation(relation);
        } catch (Exception e) {
            return ResponseEntity.status((500)).body(new Response(false, e.getMessage()));
        }
        String list = JSONArray.fromObject(relation1).toString();
        return ResponseEntity.status(200).body(new Response(true, "处理成功", list));
    }

}
