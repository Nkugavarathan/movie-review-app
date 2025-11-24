export default function MovieForm({ movie, onSubmit, setMovie }) {
  return (
    <form
      onSubmit={onSubmit}
      className="bg-white p-6 rounded-xl shadow w-full max-w-2xl mx-auto"
    >
      <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
        <input
          type="text"
          placeholder="Title"
          className="border p-2 rounded"
          value={movie.title}
          onChange={(e) => setMovie({ ...movie, title: e.target.value })}
          required
        />

        <input
          type="text"
          placeholder="Genre"
          className="border p-2 rounded"
          value={movie.genre}
          onChange={(e) => setMovie({ ...movie, genre: e.target.value })}
          required
        />

        <input
          type="text"
          placeholder="Language"
          className="border p-2 rounded"
          value={movie.language}
          onChange={(e) => setMovie({ ...movie, language: e.target.value })}
          required
        />

        <input
          type="number"
          placeholder="Duration (minutes)"
          className="border p-2 rounded"
          value={movie.duration}
          onChange={(e) => setMovie({ ...movie, duration: e.target.value })}
          required
        />

        <input
          type="text"
          placeholder="Poster URL"
          className="border p-2 rounded col-span-2"
          value={movie.posterUrl}
          onChange={(e) => setMovie({ ...movie, posterUrl: e.target.value })}
          required
        />

        <input
          type="text"
          placeholder="Trailer URL"
          className="border p-2 rounded col-span-2"
          value={movie.trailerUrl}
          onChange={(e) => setMovie({ ...movie, trailerUrl: e.target.value })}
          required
        />
      </div>

      <textarea
        placeholder="Description"
        className="border p-2 rounded w-full mt-4"
        rows="4"
        value={movie.description}
        onChange={(e) => setMovie({ ...movie, description: e.target.value })}
      ></textarea>

      <button
        type="submit"
        className="mt-4 w-full bg-[#8CE4FF] p-3 rounded-lg font-semibold"
      >
        Save Movie
      </button>
    </form>
  )
}
