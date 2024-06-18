package prod.psgm.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prod.psgm.repositories.ProjectRepository;
import prod.psgm.services.interfaces.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {}

}
