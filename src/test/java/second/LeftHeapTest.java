package second;

import lab.second.LeftHeap;
import lab.second.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeftHeapTest {
    @Test
    @DisplayName("Проверка вставки значений в кучу")
    public void checkInsert() {
        LeftHeap leftHeap = new LeftHeap();
        leftHeap.insert(1.0);
        leftHeap.insert(2.0);
        leftHeap.insert(3.0);
        leftHeap.insert(2.0);
        Node headNode = leftHeap.getHead();
        Node leftNode = headNode.getLeft();
        Node rightNode = headNode.getRight();
        Node secondLeftNode = rightNode.getLeft();
        assertAll(
                () -> assertEquals(1.0, headNode.getElement()),
                () -> assertEquals(1.0, headNode.getValue()),
                () -> assertNotNull(headNode.getLeft()),
                () -> assertNotNull(headNode.getRight()),

                () -> assertEquals(2.0, leftNode.getElement()),
                () -> assertEquals(0.0, leftNode.getValue()),
                () -> assertNull(leftNode.getLeft()),
                () -> assertNull(leftNode.getRight()),

                () -> assertEquals(2.0, rightNode.getElement()),
                () -> assertEquals(0.0, rightNode.getValue()),
                () -> assertNotNull(rightNode.getLeft()),
                () -> assertNull(rightNode.getRight()),

                () -> assertEquals(3.0, secondLeftNode.getElement()),
                () -> assertEquals(0.0, secondLeftNode.getValue()),
                () -> assertNull(secondLeftNode.getLeft()),
                () -> assertNull(secondLeftNode.getRight())
        );
    }

    @Test
    @DisplayName("Проверка очистки кучи от значений")
    public void checkClear() {
        LeftHeap leftHeap = new LeftHeap();
        leftHeap.insert(1.0);
        leftHeap.insert(2.0);
        leftHeap.insert(3.0);
        leftHeap.clear();
        assertNull(leftHeap.getHead());
    }

    @Test
    @DisplayName("Проверка удаления наименьшего элемента в куче")
    public void checkDeleteMin() {
        LeftHeap leftHeap = new LeftHeap();
        leftHeap.insert(1.0);
        leftHeap.insert(2.0);
        leftHeap.insert(3.0);
        leftHeap.insert(2.0);
        double minElement = leftHeap.deleteMin();
        assertEquals(1.0, minElement);
        Node headNode = leftHeap.getHead();
        Node leftNode = headNode.getLeft();
        Node secondLeftNode = leftNode.getLeft();
        assertAll(
                () -> assertEquals(2.0, headNode.getElement()),
                () -> assertEquals(0.0, headNode.getValue()),
                () -> assertNotNull(headNode.getLeft()),
                () -> assertNull(headNode.getRight()),

                () -> assertEquals(2.0, leftNode.getElement()),
                () -> assertEquals(0.0, leftNode.getValue()),
                () -> assertNotNull(leftNode.getLeft()),
                () -> assertNull(leftNode.getRight()),

                () -> assertEquals(3.0, secondLeftNode.getElement()),
                () -> assertEquals(0.0, secondLeftNode.getValue()),
                () -> assertNull(secondLeftNode.getLeft()),
                () -> assertNull(secondLeftNode.getRight())
        );
    }
}
