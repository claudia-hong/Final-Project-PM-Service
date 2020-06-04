package com.project.bit.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bit.project.domain.ProjectTypeDTO;
import com.project.bit.project.domain.ProjectVO;
import com.project.bit.project.mapper.ProjectMapper;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public List<ProjectVO> getProjectListAll() {
		return projectMapper.selectProjectListAll();
	}

	@Override
	public List<ProjectTypeDTO> getProjectTypeAll() {
		return projectMapper.selectProjectTypeListAll();
	}

	@Override
	public List<ProjectVO> getProjectListByType(String typeCode) {
		if(typeCode.equals("all")) return this.getProjectListAll();
		else return projectMapper.selectProjectListByType(typeCode);
	}

	@Override
	public List<ProjectVO> getProjectSearch(String typeCode, String projectName) {
		if(typeCode.equals("all") && projectName.equals("")) return projectMapper.selectProjectListAll();
		else if (typeCode.equals("all") && !projectName.equals("")) return projectMapper.selectProjectListByName(projectName);
		else if (!typeCode.equals("all") && projectName.equals("")) return projectMapper.selectProjectListByType(typeCode);
		else return projectMapper.selectProjectListByTypeAndName(typeCode, projectName);
	}

}
