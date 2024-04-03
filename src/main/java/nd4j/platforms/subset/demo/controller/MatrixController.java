package nd4j.platforms.subset.demo.controller;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixController {

    @GetMapping("/matrix")
    public double[][] calculate() {
        try (INDArray matrix1 = Nd4j.rand(1, 11); INDArray matrix2 = Nd4j.rand(11, 11)) {
            return matrix1.mmul(matrix2).toDoubleMatrix();
        }
    }
}
