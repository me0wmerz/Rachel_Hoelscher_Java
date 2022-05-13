package com.company.M2ChallengeHoelscherRachel.controller;

import com.company.M2ChallengeHoelscherRachel.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MathSolutionController {

    private static List<MathSolution> solutions = new ArrayList<>(Arrays.asList(
            new MathSolution(10,20,"add",30),
            new MathSolution(30,20,"subtract",10),
            new MathSolution(2,5,"multiply",10),
            new MathSolution(15,3,"divide",5)
    ));

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<MathSolution> getAllMathSolutions() {
        return solutions;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution addSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() instanceof Integer || mathSolution.getOperand2() instanceof Integer) {
            System.out.println("Both operands are integers");
        } else { throw new IllegalArgumentException("Both operands must be integers."); }

        mathSolution.setOperation("add");
        mathSolution.setAnswer(mathSolution.getOperand1() + mathSolution.getOperand2());
        solutions.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/subtract", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution subtractSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() instanceof Integer || mathSolution.getOperand2() instanceof Integer) {
            System.out.println("Both operands are integers");
        } else { throw new IllegalArgumentException("Both operands must be integers."); }

        mathSolution.setOperation("subtract");
        mathSolution.setAnswer(mathSolution.getOperand1() - mathSolution.getOperand2());
        solutions.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution multiplySolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() instanceof Integer || mathSolution.getOperand2() instanceof Integer) {
            System.out.println("Both operands are integers");
        } else { throw new IllegalArgumentException("Both operands must be integers."); }

        mathSolution.setOperation("multiply");
        mathSolution.setAnswer(mathSolution.getOperand1() * mathSolution.getOperand2());
        solutions.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution divideSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() instanceof Integer || mathSolution.getOperand2() instanceof Integer) {
            System.out.println("Both operands are integers");
        } else { throw new IllegalArgumentException("Both operands must be integers"); }

        if (mathSolution.getOperand2() == 0) {
            throw new NoDividingByZeroesException("Second operand cannot be zero.");
        }

        mathSolution.setOperation("divide");
        mathSolution.setAnswer(mathSolution.getOperand1() / mathSolution.getOperand2());
        solutions.add(mathSolution);
        return mathSolution;
    }
}