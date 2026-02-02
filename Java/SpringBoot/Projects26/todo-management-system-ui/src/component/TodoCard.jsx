function TodoCard({ todo, toggleTodo, deleteTodo }) {
  return (
    <div className="todo-card">
      <input
        type="checkbox"
        className="todo-checkbox"
        checked={todo.done}
        onChange={() => toggleTodo(todo.id)}
      />
      <span style={{ textDecoration: todo.done ? "line-through" : "none" }}>
        {todo.text}
      </span>
      <button onClick={() => deleteTodo(todo.id)}>Delete</button>
    </div>
  );
}

export default TodoCard;
