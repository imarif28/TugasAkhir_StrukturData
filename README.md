# Transportation Management System

A Java-based transportation management system using graph data structures for city networks and queue management for passenger services.

##  Features

- **City Management**: Add, delete, and search cities
- **Route Management**: Create weighted paths between cities  
- **Multi-Queue System**: Separate queues for Bus, Train, and Airplane
- **Network Visualization**: Display complete transportation network

##  Tech Stack

- **Language**: Java
- **Data Structures**: Graph (Adjacency List), Queue (Doubly Linked List)
- **Architecture**: Object-Oriented Programming

##  Project Structure

```
tubes_2_akhir/
├── Graph.java          # Main graph implementation
├── Simpul.java         # City nodes
├── Jalur.java          # Route edges
├── Queue.java          # Passenger queue system
├── Node.java           # Queue elements
├── main.java           # Application controller
└── messy.java          # Menu utilities
```

##  How to Run

1. **Setup**
   ```bash
   javac *.java
   java main
   ```

2. **Usage**
   - Choose from 8 menu options
   - Manage cities and routes
   - Handle passenger queues
   - View transportation network

##  Menu Options

| Option | Feature | Status |
|--------|---------|--------|
| 1 | Add Passenger Queue | ✅ |
| 2 | View Queue | ✅ |
| 3 | Manage Cities | ✅ |
| 4 | Search City | ✅ |
| 5 | Manage Routes | ✅ |
| 6 | Search Routes | 🚧 |
| 7 | Buy Tickets | 🚧 |
| 8 | View Sold Tickets | 🚧 |

##  Sample Data

Pre-loaded Japanese cities:
- Tokyo, Yokosuka, Fujiyoshida, Chichibu, Utsunomiya

##  Core Operations

**Add Route Example:**
```java
addEdge(graph, "Tokyo", "Yokosuka", 65); // 65km distance
```

**Add Passenger Example:**
```java
BusQueue.enqueue(queueNumber, "John Doe");
```

##  Complexity

- **Add City/Route**: O(n)
- **Search Operations**: O(n) 
- **Display Network**: O(n + m)

##  Future Plans

- Shortest path algorithms
- GUI interface
- Database integration
- Complete ticket system

---

## Developer

- **Name:** Ilham Muhammad Arif  
- **Institution:** Politeknik Negeri Semarang  
- **Course:** Data Structures Practicum  
