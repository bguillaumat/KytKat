package com.factolapp.kytkat;

class Network_Communication {
    private String[][] list = {
            {"Discussing IP addresses, which generation of IP is currently the most widespread?", "IPv5", "IPv4", "IPv3", "IPv6", "2"},
            {"Which generation of wireless mobile telecommunications technology let us send text-messages for the first time?", "1G", "2G", "3G", "4G", "2"},
            {"What is the role of the Transport layer of the OSI?", "It interconnects networks and fragments packets", "It supports the transmission of communication", "It connects machines to a local network and detects transmission errors", "It manages applicative connexions and guarantees connexion", "4"},
            {"In telecommunications, in which context are small cell networks useful?", "In satellite technology, because they are  very light to transport", "In underwater cables because their size is minimal", "In developing countries because they are cheap", "In big city centers, because they are used as relays of the signal", "4"},
            {"Who wrote the famous article 'As we may think' in 1945?", "Ted Nelson", "Vint Cerf", " Vannevar Bush", "Alan Turing", "3"},
            {"What does a Transmission Control Protocol (TCP) do?", "It breaks down a file or a message into a small packets", "It is like a serial number for a network device, it is specific and unique to that device", "It automatically assigns a list of dynamic IP addresses to a host when it connects to a network", "It sends the packets form one place to another", "4"},
            {"If a hacker taps a server to change the domain name associated to an IP address, we can say he is ...", "Degrading the bandwidth", "Altering the packets", "Changing the communication protocols", "Spoofing the DNS", "4"},
            {"Which word matches the definition: The time it takes for a bit to travel from one place to another is ...", "Bandwidth", "Wi-Fi", "Latency", "Speed of light", "3"},
            {"By which means does as much as 99% of the digital information travel around the world?", "Satellites", "Antennas", "Underwater fiber-optic cables", "Copper cable", "1"},
            {"The inventor of the telephone, in 1876, is generally said to be", "Graham Bell", "Volta", "Morse", "Baudot", "1"},
            {"What is the OSI model made of?", "It is a physical device present in every computer", "It is a small black box that sits on top of Big Ben", "It is made of fiber-optic cables", "It is made of several layers", "4"},
            {"What does the Address Resolution Protocol (ARP) do?", "It automatically assigns a list of dynamic IP addresses to a host when it connects to a network", "It sends the packets from one place to another", "It break down a file or message into small packets", "It is a protocol that maps the logical IP addresses to the MAC addresses of a network device", "4"},
            {"What is the point in switching to IPv6?", "Updating the existing addresses with more details", "Making devices more secure", "Making signal transmission faster", "Getting longer IP addresses so we can have more addresses and more secures ones", "4"},
            {"What does the Dynamic Host Configuration Protocol (DHCP) do?", "It breaks down a file or messages into small packets", "It is like a serial number for a network device, it is specific and unique to that device", "It sends the packets from one place to another", "It automatically assigns a list of dynamic IP addresses to a host when it connects to a network", "2"},
            {"What is the role of the OSI model?", "It's a model for the creation of new database software", "It's a set of rules to secure telecommunications", "it's the first internet connexion", "It's a norm that sets how computers should communicate", "4"},
            {"As far as Internet infrastructures are concerned, we may say that the routers act as", "traffic managers", "packet preparators", "huge directories", "protocol police", "1"},
            {"Which company can say that it 'built a belt around the world with cables'?", "Facebook", "Baby Bells", "Google", "Tata Telecommunications", "4"},
            {"What is the role of the Data Link layer of the OSI?", "It interconnects network and fragments packets", "It manages applicative connexions and guarantees connexion", "It connects machines to a local network and detect transmission errors", "It supports the transmission of communication", "1"},
            {"Which layer is NOT a host-specific layer of the OSI model?", "Presentation", "Application", "Data Link", "Session", "3"},
            {"If I want to send long-distance signals, which method is best?", "Smoke", "Copper cable", "Radio signals", "Fiber-optic cable", "4"},
            {"What can you find at 60 Huston Street New York?", "AT&T HeadQuarters", "The headquarters of Google", "A huge telecom facilities building", "The TedTalks Theatre", "3"},
            {"Which technology can triangulate the spot from where the datastream signal is sent?", "Full Duplex", "Beamforming", "Massive MIMO", "Fiber-optic cables", "2"},
            {"Which organization set the OSI model in 1984?", "SOI", "ISO", "OIS", "SIO", "2"},
            {"Routers and TCP guarantee fault intolerance and redundancy, which in return guarantee ...", "Reliability", "Speed", "Protocols", "Security", "1"},
            {"In the history of the telegraph, Baudot is a very famous inventor, why?", "He was the first one to use a telegraph across the Atlantic ocean", "He built the telegraph designed by Bell", "He founded the AT&T original company", "He created a fixed-length five-bit binary code still in use today in the ASCII table", "4"},
            {"Which word matches the definition: The maximum transmission capacity of a device is the ...", "Bandwidth", "Fiber-optic cable", "RAM", "Power", "1"},
            {"The very first device called iPhone was presented at the CES in Las Vegas in 1998, by which company?", "Apple", "AT&T", "InfoGear", "Cisco", "3"},
            {"Talking about mobile telecommunications, what is the main drawback of using millimeter waves?", "It's bandwidth collides with other devices ones", "It's bandwidth is very narrow", "It is very expensive", "It has trouble going through obstacles", "4"},
            {"What is the role of the Physical Layer of the OSI?", "It connects machines to a local network and detects transmission errors", "It manages applicative connexions and guarantees connexion", "It interconnects networks and fragments packets", "It support the transmission of communication", "1"},
            {"Choose the answer that does NOT match the sentence: we can send bits at a distance via", "Electricity", "Microwaves", "Water", "Light", "3"},
            {"What did Vannevar Bush invent in 1945?", "The memex", "The HyperCard", "Xanadu", "HyperTies", "1"},
            {"What is the name of the first telecom satellite launched in 1962?", "Apollo", "Telstar", "Spoutnik", "AT&T", "3"},
            {"What are Vint Cerf and Bob Khan famous for?", "Mapping the world's internet infrastructure", "Creating the World Wide Web", "Inventing IP protocol", "Building the first large scale computer", "3"},
            {"Which unit of speed transmission used for modems is named after an inventor in the telecom fields?", "The Vinci", "The Bell", "The Marconi", "The Baud", "4"},
            {"Who invented and presented the first effective mouse?", "Douglas Engelbart", "T. Berners Lee", "Danny Hillis", "Ted Nelson", "1"},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
            //{"", "", "", "", "", ""},
    };


    String[][] returnList() {
        return list;
    }
}
