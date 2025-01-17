/**
 * Copyright 卫志强 QQ：598748873@qq.com Inc. All rights reserved.
 */

package com.skyeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skyeye.common.object.InputObject;
import com.skyeye.common.object.OutputObject;
import com.skyeye.service.AssemblySheetService;

/**
 *
 * @ClassName: AssemblySheetController
 * @Description: 组装单管理控制类
 * @author: skyeye云系列--卫志强
 * @date: 2021/6/26 9:50
 *
 * @Copyright: 2021 https://gitee.com/doc_wei01/skyeye Inc. All rights reserved.
 * 注意：本内容仅限购买后使用.禁止私自外泄以及用于其他的商业目的
 */
@Controller
public class AssemblySheetController {
	
	@Autowired
	private AssemblySheetService assemblySheetService;
	
	/**
     * 获取组装单列表信息
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/AssemblySheetController/queryAssemblySheetToList")
    @ResponseBody
    public void queryAssemblySheetToList(InputObject inputObject, OutputObject outputObject) throws Exception{
    	assemblySheetService.queryAssemblySheetToList(inputObject, outputObject);
    }
	
    /**
     * 新增组装单信息
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/AssemblySheetController/insertAssemblySheetMation")
    @ResponseBody
    public void insertAssemblySheetMation(InputObject inputObject, OutputObject outputObject) throws Exception{
    	assemblySheetService.insertAssemblySheetMation(inputObject, outputObject);
    }
    
    /**
     * 编辑组装单信息时进行回显
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/AssemblySheetController/queryAssemblySheetMationToEditById")
    @ResponseBody
    public void queryAssemblySheetMationToEditById(InputObject inputObject, OutputObject outputObject) throws Exception{
    	assemblySheetService.queryAssemblySheetMationToEditById(inputObject, outputObject);
    }
    
    /**
     * 编辑组装单信息
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/AssemblySheetController/editAssemblySheetMationById")
    @ResponseBody
    public void editAssemblySheetMationById(InputObject inputObject, OutputObject outputObject) throws Exception{
    	assemblySheetService.editAssemblySheetMationById(inputObject, outputObject);
    }
    
    /**
     * 导出Excel
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/AssemblySheetController/queryMationToExcel")
    @ResponseBody
    public void queryMationToExcel(InputObject inputObject, OutputObject outputObject) throws Exception{
    	assemblySheetService.queryMationToExcel(inputObject, outputObject);
    }
    
}
