package com.ejemplo.tareas.controllers;

import com.ejemplo.tareas.models.Tarea;
import com.ejemplo.tareas.repositories.TareaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tareas")
public class TareaController {

    private final TareaRepository tareaRepo;

    public TareaController(TareaRepository tareaRepo) {
        this.tareaRepo = tareaRepo;
    }

    @GetMapping
    public String listarTareas(Model model) {
        model.addAttribute("tareas", tareaRepo.findAll());
        return "tareas";
    }

    @PostMapping
    public String agregarTarea(@ModelAttribute Tarea tarea) {
        tareaRepo.save(tarea);
        return "redirect:/tareas";
    }
}
