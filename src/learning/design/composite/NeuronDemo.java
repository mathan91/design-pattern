package learning.design.composite;

public class NeuronDemo {

	public static void main(String[] args) {
		Neuron neuron1 = new Neuron();
		Neuron neuron2 = new Neuron();
		
		NeuronLayer layer = new NeuronLayer();
		NeuronLayer layer2 = new NeuronLayer();
		
		neuron1.connectTo(neuron2);
		neuron2.connectTo(neuron1);
		layer.connectTo(neuron1);
		layer.connectTo(layer2);

	}
}
