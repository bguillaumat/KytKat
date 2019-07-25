package com.factolapp.kytkat;

class Artificial_Intelligence {
    private String[][] list = {
            {"A Perceptron can solve:", "All", "The NAND function", "The XOR function", "The OR/AND function", "4"},
            {"Reinforcement learning is similar to...", "Supervised learning", "None, Reinforcement learning is another paradigm", "Unsupervised learning", "Genetic algorithms", "2"},
            {"What are the inputs of biological neurons?", "The cell body", "The Synapses", "The axon", "The Dendrites", "4"},
            {"What was the name of the AI able to beat the best GO player in 2015?", "AlphaGo", "AlphaGoZero", "Deep Blue", "Deep Net", "1"},
            {"What was the name of the AI able to beat Kasparov in 1997?", "Deep Blue", "AlphaGo", "AlphaGo Zero", "Deep Net", "1"},
            {"In reinforcement learning, the environment takes as input the action performed by the agent and returns:", "A new state", "The next action to perform and a new state", "Nothing", "A new state and a reward", "4"},
            {"Why did Microsoft's AI chatbot become racist?", "Because the bot started following racist persons on Twitter", "Because the bot figured out it was an interesting solution to minimize the given cost function", "Because the bot created a biased representation of the world", "Because people started tweeting the bot with all sort of misogynistic, racist remarks", "4"},
            {"A Multilayer Perceptron can solve:", "The XOR function", "All", "The OR/AND function", "The NAND function", "2"},
            {"Deep learning is good working with...", "A lot of noisy training data", "Neural Network", "Small and noisy data", "Accurate training data", "4"},
            {"How does AlphaGo work?", "The algorithm relies on Deep neural networks and supervised learning", "The algorithm relies on evolutionary algorithms", "The algorithm relies in Deep neural network, Supervised learning and Unsupervised learning", "The algorithm relies on Deep neural networks, Supervised Learning and reinforcement learning", "4"},
            {"What is the Validation set in Machine learning?", "It is used for finally checking the overall performance of a neural net", "It is used to determine the performance of a neural network on patterns that are not trained during learning", "It is used to train a neural net. The error of this dataset is minimizing during training", "It is used to train, validate and test the model", "1"},
            {"What are the 'outputs' of biological neurons?", "The Dendrites", "The cell body", "The Synapses", "The axon", "3"},
            {"What is Deep Learning?", "Deep learning is a subset of machine learning in AI that has networks capable of learning unsupervised form data that is unstructured or unlabeled", "Deep learning is a biological simulation of the human brain", "Deep learning is a subset of generic algorithms in the AI that has networks capable of learning unsupervised from data that is unstructured or unlabeled", "Deep learning is an extension of symbolic AI that has networks capable of learning unsupervised from data that is unstructured and unlabeled", "1"},
            {"What is the Training set in Machine Learning?", "It is used for finally checking the overall performance of a neural net", "It is used to train, validate and test the model", "It is used to determine the performance of a neural network on patterns that are not trained during learning", "It is used to train a neural net. The error of this dataset is minimized during training", "4"},
            {"Why is Imagenet so hard to learn for a model?", "Because of the millions of classes and the high number of images", "Because of the non-linearity in the distribution of images", "Because of the millions of images and the high number of classes", "Because of the size of the dataset", "3"},
            {"Why is it required to minimize an error to train a deep learning model?", "Because we want the model to be able to predict a minimized version of the error at the end", "Because we want the model to be able to predict the best output. The error measures the cost of the model", "Because we want to use a gradient descent", "Because we want the model to be able to predict the best output. The error measures the accuracy with respect to the training set", "1"},
            {"What is the Turing test?", "The Turing test tries to evaluate the intelligence of an AI system", "The Turing test is a test to see if a computer can trick a person into believing that a computer is a person too", "The Turing test is a test to see if a computer can think", "The Turing test is a test to evaluate the capability of  computer to interact with someone", "2"},
            {"What is the Bias Problem in Machine Learning?", "The problem of being stuck into sub optimal solution", "The problem of not learning meaningful correlations", "The incapability for a neutral network to generalize without bias", "The problem of learning and repeating human bias into an algorithm", "2"},
            {"In order to train a model with supervised learning to predict something, you first need to" , "Get an appropriate dataset", "Setup an environment", "Setup a reward, then maximize this reward", "Setup an error, then minimize this error", "1"},
            {"When was the last major breakthrough in Deep Learning and why?", "2006, because of the low error on the Imagenet Dataset", "2012, because of the low error on the Imagenet Dataset", "2012, because of the low error on MNIST", "2006, because of the low error on MNIST", "2"},
            {"Supervised learning...", "Takes S (state) and output R (reward)", "Takes S (state) and output A an action to take", "Takes X (inputs), T (targets) as input and output Y (the prediction)", "Takes X (inputs) and output X' (a transformed representation of X)", "3"},
            {"Select the correct proposal", "Deep learning is a subfield of Machine Learning which is a Subfield of AI", "Machine Learning is the same thing as Deep learning which is a subfield of AI", "Machine Learning is a subfield of Deep Learning which is a subfield of AI", "Machine learning is a subfield of Symbolic AI which is a subfield of AI", "1"},
            {"Unsupervised learning...", "Takes S (state) and output R (reward)", "Takes S (state) and output A an action to take", "Takes X (inputs), T (targets) as input and output Y (the prediction)", "Takes X (inputs) and output X' (a transformed representation of X)", "4"},
            {"In what does AlphaGoZero differ from AlphaGo?", "AlphaZero does not learn from human (dataset) but by total self-play", "AlphaGoZero does not learn with supervised learning but with unsupervised leaning", "AlphaGoZero does not learn from human (dataset) but by total self-play", "AlphaGoZero does not learn from evolutionary algorithms but with genetic algorithms", "3"},
            {"Narrow AI is...", "An intelligent system limited by computational capabilities", "An AI able to perform only one task", "An AI limited in order not to take over Humans", "An AI able to perform one set of task from the same distribution", "2"},
            {"What is Artificial General Intelligence?", "Machines able to perform  a wide variety of human tasks", "Any intellect that greatly exceeds the cognitive performance of humans in virtually all domains of interest", "Machines that exhibit human intelligence", "An AI able to used previous knowledge to solve new problems", "3"},
            {"What is the name of a famous algorithm to minimize a function/error in a neural network?", "Partial differentiation", "Gradient Descent", "Regression", "Optimistic search", "2"},
            {"What is epsilon-greedy?", "A popular reinforcement learning algorithm", "A method to estimate the best possible action to perform", "This is an exploration method. 'Epsilon' is the percentage of exploration, 'greedy' the percentage of exploitation", "This is an exploration method. 'Epsilon' is the percentage of exploitation, 'greedy' the percentage of exploration", "2"},
            {"What is an overfitting?", "A model that models the 'validation set' too well", "A model that models the 'training data' badly", "A model that models the 'training data' too well", "A model that models the 'testing set' badly", "3"},
            {"What is Artificial Super Intelligence?", "An AI able to use previous knowledge to solve new problems", "Machines able to perform all human tasks", "Any intellect that greatly exceeds the cognitive performance of humans in virtually all domains of interest", "Machines that exhibit human intelligence", "3"},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
    };

    String[][] returnList() {
        return list;
    }

}
